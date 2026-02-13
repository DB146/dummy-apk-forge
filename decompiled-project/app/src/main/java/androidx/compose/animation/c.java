package androidx.compose.animation;

import V0.k;
import c0.m;
import com.bumptech.glide.d;
import x.AbstractC2232b;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final long f13124a;

    static {
        long j = Integer.MIN_VALUE;
        f13124a = (j & 4294967295L) | (j << 32);
    }

    public static m a(m mVar) {
        long j = 1;
        return d.d(mVar).c(new SizeAnimationModifierElement(AbstractC2232b.j(1, new k((j & 4294967295L) | (j << 32)))));
    }
}
