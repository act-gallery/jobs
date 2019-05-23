### ACT Framework Jobs Demo Applications

Usage:

To start in dev mode:

```bash
cd /path/to/a/app
mvn clean compile exec:exec
```

To start in prod mode:

```bash
cd /path/to/a/app
mvn clean package
cd target/dist
unzip *.zip
./start
```

Once the app started, go to `http://localhost:5460` to start playing with the app.