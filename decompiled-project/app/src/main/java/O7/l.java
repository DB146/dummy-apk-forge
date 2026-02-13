package O7;

import java.util.regex.Pattern;
import y.S;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f7502a = Pattern.compile("[\\[\\]\\.#$]");

    static {
        Pattern.compile("[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]");
    }

    public static void a(String str) {
        if (f7502a.matcher(str).find()) {
            throw new RuntimeException(S.b("Invalid Firebase Database path: ", str, ". Firebase Database paths must not contain '.', '#', '$', '[', or ']'"));
        }
    }

    public static void b(String str) {
        if (str.startsWith(".info")) {
            a(str.substring(5));
        } else if (str.startsWith("/.info")) {
            a(str.substring(6));
        } else {
            a(str);
        }
    }
}
