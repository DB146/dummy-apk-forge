package D9;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
import n5.v;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f3289a;

    public a(String str) {
        this.f3289a = A3.c.e(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public /* synthetic */ a(String str, boolean z8) {
        this.f3289a = str;
    }

    public static a a(v vVar) {
        String str;
        vVar.H(2);
        int v10 = vVar.v();
        int i7 = v10 >> 1;
        int v11 = ((vVar.v() >> 3) & 31) | ((v10 & 1) << 5);
        if (i7 == 4 || i7 == 5 || i7 == 7) {
            str = "dvhe";
        } else if (i7 == 8) {
            str = "hev1";
        } else {
            if (i7 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i7);
        sb2.append(v11 >= 10 ? "." : ".0");
        sb2.append(v11);
        return new a(sb2.toString(), false);
    }

    public static String d(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e2) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e2);
                str2 = X.c.j(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return X.c.i(str, " : ", str2);
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", d(this.f3289a, str, objArr));
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", d(this.f3289a, str, objArr));
        }
    }
}
