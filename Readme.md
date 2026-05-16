# PhishScan AI

PhishScan AI is a hybrid phishing URL detection system developed using Machine Learning, Deep Learning, Electron.js, SQL, and frontend web technologies.

The system analyzes URLs and predicts whether they are safe or phishing by combining Random Forest and CNN (Convolutional Neural Network) models for real-time phishing threat detection.

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

## Database Technologies
- SQL
- SQLite-based relational schema design

## Data Processing Libraries
- NumPy
- Pandas
- Joblib

## URL Processing / Feature Extraction
- urllib.parse
- Regular Expressions (re)

## Additional Modules
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
- SQL-based scan history schema
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

# Database Design

A relational SQL schema was designed for storing phishing scan history and analysis results.

Stored fields include:
- Scanned URL
- Random Forest Score
- CNN Score
- Hybrid Risk Score
- Prediction Result
- Scan Timestamp

SQL operations implemented:
- CREATE TABLE
- INSERT
- SELECT

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
| opening.html | Opening interface |
| safe.html | Safe result page |
| unsafe.html | Unsafe result page |
| main.js | Electron.js application logic |
| predict.py | Real-time phishing prediction engine |
| train_model.py | Model training module |
| features.py | URL feature extraction |
| URLValidator.java | Java URL validation module |
| database.sql | SQL schema for scan history management |

---

# System Workflow

1. User enters URL
2. URL preprocessing and validation
3. Feature extraction
4. Random Forest prediction
5. CNN sequence analysis
6. Hybrid risk score calculation
7. SQL-based scan record storage
8. Safe / Unsafe classification
9. Result displayed to user

---

# Technical Implementation

## Frontend
Implemented responsive UI pages using HTML5, CSS3, and JavaScript with Electron.js integration for desktop application deployment.

## JavaScript / Electron.js
Implemented asynchronous IPC communication, dynamic DOM rendering, scan orchestration, progress visualization, and real-time interaction between frontend and backend modules.

## Java
Developed a Java-based URL validation utility using Java Networking APIs for URL syntax validation, HTTPS verification, and domain extraction.

## SQL
Designed a relational SQL schema for phishing scan history management and structured storage of analysis results.

## Machine Learning
Implemented Random Forest for lexical feature analysis and CNN for character-level phishing pattern recognition using TensorFlow/Keras.

---

# Future Scope

- Browser extension integration
- Real-time threat intelligence APIs
- Cloud-based phishing detection service
- Advanced transformer-based detection models
- Full SQL database integration
- User authentication and scan history dashboard

---

# Author

Midhun Krishna