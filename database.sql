CREATE TABLE scan_history (

    id INTEGER PRIMARY KEY AUTOINCREMENT,

    scanned_url TEXT NOT NULL,

    rf_score REAL,

    cnn_score REAL,

    risk_score REAL,

    prediction TEXT,

    scan_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO scan_history
(scanned_url, rf_score, cnn_score, risk_score, prediction)

VALUES
(
    'https://google.com',
    0.01,
    0.02,
    0.015,
    'SAFE'
);

SELECT * FROM scan_history;