package y6;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: y6.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2402h implements InterfaceC2397c {

    /* renamed from: a, reason: collision with root package name */
    public final float f27047a;

    public C2402h(float f4) {
        this.f27047a = f4;
    }

    @Override // y6.InterfaceC2397c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f27047a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2402h) && this.f27047a == ((C2402h) obj).f27047a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f27047a)});
    }
}
