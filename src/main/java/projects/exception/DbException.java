package projects.exception;

@SuppressWarnings("serial")
public class DbException extends RuntimeException {
    public DbException(String msg) {
         super (msg);
    }
    public DbException(Throwable cause) {
        super (cause);
    }
    public DbException(String msg, Throwable cause) {
        super (msg,cause);
    }
}
