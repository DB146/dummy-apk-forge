package y6;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: y6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2395a implements InterfaceC2397c {

    /* renamed from: a, reason: collision with root package name */
    public final float f26994a;

    public C2395a(float f4) {
        this.f26994a = f4;
    }

    @Override // y6.InterfaceC2397c
    public final float a(RectF rectF) {
        return this.f26994a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2395a) && this.f26994a == ((C2395a) obj).f26994a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f26994a)});
    }
}
