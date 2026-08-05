# Car Price Prediction — Data Science Task 3

Short description
-----------------
Predict the selling price of used cars using exploratory data analysis, feature engineering, and regression models (Linear Regression, Random Forest, Gradient Boosting). This project contains a self-contained Jupyter Notebook that walks through the full workflow from data loading to model evaluation using the included dataset.

Key features
------------
- Clean, documented Jupyter Notebook with end-to-end workflow:
  - Data loading and inspection
  - Data cleaning and deduplication
  - Feature engineering (brand extraction, car age)
  - Exploratory Data Analysis (distributions, boxplots, correlation heatmap)
  - Preprocessing pipeline (imputation + One-Hot Encoding)
  - Model training and evaluation (Linear Regression, Random Forest, Gradient Boosting)
- Reproducible preprocessing implemented using scikit-learn Pipelines and ColumnTransformer
- Evaluation using common regression metrics (MAE, MSE, RMSE, R²)
- Small CSV dataset included (data/car data.csv)

Repository contents
-------------------
- Task3_CarPricePrediction_withML.ipynb — Jupyter Notebook with full analysis and model training
- data/car data.csv — dataset used in the notebook

Installation
------------
Prerequisites
- Python 3.8+ (recommended)
- Git (to clone the repo)

Recommended steps (venv + pip)
1. Clone the repository:
   ```bash
   git clone https://github.com/MoshoodSO/OIBSIP.git
   cd OIBSIP/DataScience-Task3_CarPricePrediction
   ```
2. Create and activate a virtual environment:
   ```bash
   python -m venv .venv
   # macOS / Linux
   source .venv/bin/activate
   # Windows (PowerShell)
   .venv\Scripts\Activate.ps1
   ```
3. Install required Python packages:
   ```bash
   pip install --upgrade pip
   pip install pandas numpy matplotlib seaborn scikit-learn jupyterlab
   ```
   (Optionally pin exact versions if you need reproducibility.)

4. Start Jupyter Lab / Notebook to run the analysis:
   ```bash
   jupyter lab
   # or
   jupyter notebook
   ```
   Then open `Task3_CarPricePrediction_withML.ipynb` and run the cells.

Quick usage examples
--------------------

1) Open and run the notebook
- Launch Jupyter, open `Task3_CarPricePrediction_withML.ipynb`, run cells sequentially. The notebook performs data loading from `data/car data.csv`, EDA, preprocessing, model training and evaluation.

2) Example: reproduce the preprocessing + model-training pipeline in a Python script
- Use this snippet (adapted from the notebook) to train a Random Forest pipeline programmatically.

```python
import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.pipeline import Pipeline
from sklearn.compose import ColumnTransformer
from sklearn.preprocessing import OneHotEncoder
from sklearn.impute import SimpleImputer
from sklearn.ensemble import RandomForestRegressor
from sklearn.metrics import mean_absolute_error, mean_squared_error, r2_score

# Load data
 df = pd.read_csv("data/car data.csv")
 df.columns = df.columns.str.lower()
 # Feature engineering
 df['brand'] = df['car_name'].str.split().str[0].str.capitalize()
 current_year = 2026
 df['car_age'] = current_year - df['year']

 # Prepare X and y
 X = df.drop('selling_price', axis=1)
 y = df['selling_price']

 # Identify column types
 cat_cols = X.select_dtypes(include='object').columns
 num_cols = X.select_dtypes(exclude='object').columns

 # Preprocessing pipelines
 categorical_transformer = Pipeline([
     ('imputer', SimpleImputer(strategy='most_frequent')),
     ('onehot', OneHotEncoder(handle_unknown='ignore'))
 ])
 numeric_transformer = Pipeline([
     ('imputer', SimpleImputer(strategy='median'))
 ])
 preprocessor = ColumnTransformer([
     ('cat', categorical_transformer, cat_cols),
     ('num', numeric_transformer, num_cols)
 ])

 # Full pipeline
 pipeline = Pipeline([
     ('preprocessor', preprocessor),
     ('model', RandomForestRegressor(n_estimators=100, random_state=42))
 ])

 # Train/test split and fit
 X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3, random_state=42)
 pipeline.fit(X_train, y_train)

 # Predict & evaluate
 y_pred = pipeline.predict(X_test)
 print("MAE:", mean_absolute_error(y_test, y_pred))
 print("MSE:", mean_squared_error(y_test, y_pred))
 print("RMSE:", mean_squared_error(y_test, y_pred, squared=False))
 print("R^2:", r2_score(y_test, y_pred))
```

3) Making a single prediction (after training)
```python
# Example single-row inference
sample = X_test.iloc[[0]]  # take a single sample from test set
pred_price = pipeline.predict(sample)
print("Predicted selling price:", pred_price[0])
```

Notes and tips
-------------
- The notebook already includes visualizations (histograms, boxplots, scatterplots, correlation heatmap) to guide feature selection.
- If you plan to deploy a model, save the trained pipeline with joblib:
  ```python
  import joblib
  joblib.dump(pipeline, "car_price_pipeline.pkl")
  ```
  and later load with `joblib.load("car_price_pipeline.pkl")`.
- If you want to run on Google Colab, upload the notebook and `car data.csv` to Colab or use GitHub file import.

Technologies & libraries used
-----------------------------
- Python 3.8+
- Jupyter Notebook / JupyterLab
- pandas
- numpy
- matplotlib
- seaborn
- scikit-learn (Pipeline, ColumnTransformer, regressors and metrics)

Dataset
-------
- The dataset included in this folder is: data/car data.csv
- The notebook documents shapes, basic stats, null checks, and deduplication steps performed on this CSV.

Contributing
------------
Contributions are welcome. Suggested workflow:
1. Fork the repository
2. Create a branch for your change: `git checkout -b feat/your-feature`
3. Make changes and add tests / notebook updates
4. Open a pull request describing your change

License
-------
This project is provided under the MIT License. See the LICENSE file in the repository root for full text.

Contact
-------
For questions or suggestions you can open an issue in this repository or contact the maintainer: MoshoodSO (GitHub: @MoshoodSO).
