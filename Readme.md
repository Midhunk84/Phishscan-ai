# PhishScan AI

PhishScan AI is a hybrid phishing URL detection system developed using Machine Learning, Deep Learning, Electron.js, and frontend web technologies.

The system analyzes URLs and predicts whether they are safe or phishing by combining Random Forest and CNN (Convolutional Neural Network) models.

---

# Technologies Used

## Frontend Technologies
- HTML5
- CSS3
- JavaScript

## Desktop Application Framework
- Electron.js
- Node.js

## Backend Technologies
- Python

## Machine Learning / Deep Learning
- Scikit-learn
- TensorFlow
- Keras
- Random Forest Classifier
- Convolutional Neural Network (CNN)

## Data Processing Libraries
- NumPy
- Pandas
- Joblib

## URL Processing / Feature Extraction
- urllib.parse
- Regular Expressions (re)

## Additional Module
- Java URL Validation Module

## Development Tools
- Visual Studio Code
- GitHub
- PyInstaller
- npm

---

# Project Features

- Real-time phishing URL detection
- Hybrid ML + DL prediction engine
- Random Forest lexical feature analysis
- CNN character-level URL pattern analysis
- Safe / Unsafe result pages
- Risk score calculation
- URL structure analysis
- Electron.js desktop application interface
- Java-based URL validation support module

---

# Machine Learning Features Used

The system extracts lexical and structural URL features such as:

- HTTPS presence
- URL length
- Dot count
- Subdomain count
- Suspicious keywords
- Suspicious TLD detection
- Entropy analysis
- Digit ratio
- Special character count
- Path depth

---

# Model Performance

- Accuracy: 98%
- Precision: 93%
- Recall: 95%
- ROC-AUC: 0.99

Dataset Size:
- 522K+ URLs

---

# Project Files

| File | Description |
|------|-------------|
| index.html | Main scanning page |
| safe.html | Safe result page |
| unsafe.html | Unsafe result page |
| opening.html | Opening interface |
| main.js | Electron.js application logic |
| predict.py | Real-time phishing prediction engine |
| train_model.py | Model training module |
| features.py | URL feature extraction |
| URLValidator.java | Java URL validation module |

---

# System Workflow

1. User enters URL
2. URL preprocessing and feature extraction
3. Random Forest prediction
4. CNN sequence analysis
5. Hybrid risk score calculation
6. Safe / Unsafe classification
7. Result displayed to user

---

# Author

Midhun Krishna