package Y5;

import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes.dex */
public final class G1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11369a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11370b;

    public G1(I1 i12, String str) {
        Objects.requireNonNull(i12);
        this.f11369a = str;
        ((M5.b) i12.e()).getClass();
        this.f11370b = SystemClock.elapsedRealtime();
    }
}
