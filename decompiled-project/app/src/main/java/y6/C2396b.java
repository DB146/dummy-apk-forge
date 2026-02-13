package y6;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: y6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2396b implements InterfaceC2397c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2397c f26995a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26996b;

    public C2396b(float f4, InterfaceC2397c interfaceC2397c) {
        while (interfaceC2397c instanceof C2396b) {
            interfaceC2397c = ((C2396b) interfaceC2397c).f26995a;
            f4 += ((C2396b) interfaceC2397c).f26996b;
        }
        this.f26995a = interfaceC2397c;
        this.f26996b = f4;
    }

    @Override // y6.InterfaceC2397c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f26995a.a(rectF) + this.f26996b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2396b)) {
            return false;
        }
        C2396b c2396b = (C2396b) obj;
        return this.f26995a.equals(c2396b.f26995a) && this.f26996b == c2396b.f26996b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26995a, Float.valueOf(this.f26996b)});
    }
}
