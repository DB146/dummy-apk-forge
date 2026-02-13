package Y6;

import com.google.android.gms.common.internal.G;

/* loaded from: classes.dex */
public class k extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str) {
        super(str);
        G.e(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, Throwable th) {
        super(str, th);
        G.e(str, "Detail message must not be empty");
    }
}
