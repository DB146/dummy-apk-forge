package G6;

import X.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a extends j {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(int i7) {
        super(new Status(i7, String.format(r1, "Install Error(%d): %s", r2, r3), null, null));
        String str;
        Locale locale = Locale.getDefault();
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = H6.a.f4895a;
        Integer valueOf2 = Integer.valueOf(i7);
        if (hashMap.containsKey(valueOf2)) {
            HashMap hashMap2 = H6.a.f4896b;
            if (hashMap2.containsKey(valueOf2)) {
                str = c.j((String) hashMap.get(valueOf2), " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#", (String) hashMap2.get(valueOf2), ")");
                if (i7 != 0) {
                    throw new IllegalArgumentException("errorCode should not be 0.");
                }
                return;
            }
        }
        str = "";
        if (i7 != 0) {
        }
    }
}
