package I5;

import android.util.Log;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5230a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5231b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5232c;

    public a(String str, String... strArr) {
        String sb2;
        if (strArr.length == 0) {
            sb2 = "";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            for (String str2 : strArr) {
                if (sb3.length() > 1) {
                    sb3.append(",");
                }
                sb3.append(str2);
            }
            sb3.append("] ");
            sb2 = sb3.toString();
        }
        this.f5231b = sb2;
        this.f5230a = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (length > 23) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        int i7 = 2;
        while (i7 <= 7 && !Log.isLoggable(this.f5230a, i7)) {
            i7++;
        }
        this.f5232c = i7;
    }

    public final void a(String str, Object... objArr) {
        if (this.f5232c <= 3) {
            Log.d(this.f5230a, d(str, objArr));
        }
    }

    public final void b(String str, Exception exc, Object... objArr) {
        Log.e(this.f5230a, d(str, objArr), exc);
    }

    public final void c(String str, Object... objArr) {
        Log.e(this.f5230a, d(str, objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f5231b.concat(str);
    }

    public final void e(String str, Object... objArr) {
        if (this.f5232c <= 2) {
            Log.v(this.f5230a, d(str, objArr));
        }
    }

    public final void f(String str, Object... objArr) {
        Log.w(this.f5230a, d(str, objArr));
    }
}
