### ACT Framework Jobs Demo Applications

Usage:

To start in dev mode:

```bash
cd /path/to/a/app
mvn clean compile act:run 
```

To start in prod mode:

```bash
cd /path/to/a/app
mvn clean package
cd target/dist
tar xzf *.tgz
./run
```

Once the app started, go to `http://localhost:5460` to start playing with the app.
