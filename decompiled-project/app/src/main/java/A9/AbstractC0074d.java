package A9;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: A9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0074d {

    /* renamed from: a, reason: collision with root package name */
    public long f1099a;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1103e = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f1101c = "";

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f1102d = null;

    /* renamed from: b, reason: collision with root package name */
    public Drawable f1100b = null;

    public AbstractC0074d(long j) {
        this.f1099a = -1L;
        this.f1099a = j;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(this.f1101c)) {
            sb2.append(this.f1101c);
        }
        if (!TextUtils.isEmpty(this.f1102d)) {
            if (!TextUtils.isEmpty(this.f1101c)) {
                sb2.append(" ");
            }
            sb2.append(this.f1102d);
        }
        if (this.f1100b != null && sb2.length() == 0) {
            sb2.append("(action icon)");
        }
        return sb2.toString();
    }
}
