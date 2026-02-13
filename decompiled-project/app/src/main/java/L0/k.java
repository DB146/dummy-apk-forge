package L0;

import android.graphics.Canvas;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final i f6261a = new Canvas();

    /* renamed from: b, reason: collision with root package name */
    public static final long f6262b;

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.Canvas, L0.i] */
    static {
        long j = 0;
        f6262b = (j & 4294967295L) | (j << 32);
    }

    public static final TextDirectionHeuristic a(int i7) {
        return i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }
}
