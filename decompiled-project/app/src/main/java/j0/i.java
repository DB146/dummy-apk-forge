package j0;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import y.S;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ColorFilter f18543a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18544b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18545c;

    public i(int i7, long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1363a.f();
            porterDuffColorFilter = AbstractC1363a.c(AbstractC1362A.z(j), AbstractC1362A.w(i7));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(AbstractC1362A.z(j), AbstractC1362A.B(i7));
        }
        this.f18543a = porterDuffColorFilter;
        this.f18544b = j;
        this.f18545c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return n.c(this.f18544b, iVar.f18544b) && AbstractC1362A.j(this.f18545c, iVar.f18545c);
    }

    public final int hashCode() {
        int i7 = n.f18553h;
        return Integer.hashCode(this.f18545c) + (Long.hashCode(this.f18544b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BlendModeColorFilter(color=");
        S.d(this.f18544b, ", blendMode=", sb2);
        int i7 = this.f18545c;
        sb2.append((Object) (AbstractC1362A.j(i7, 0) ? "Clear" : AbstractC1362A.j(i7, 1) ? "Src" : AbstractC1362A.j(i7, 2) ? "Dst" : AbstractC1362A.j(i7, 3) ? "SrcOver" : AbstractC1362A.j(i7, 4) ? "DstOver" : AbstractC1362A.j(i7, 5) ? "SrcIn" : AbstractC1362A.j(i7, 6) ? "DstIn" : AbstractC1362A.j(i7, 7) ? "SrcOut" : AbstractC1362A.j(i7, 8) ? "DstOut" : AbstractC1362A.j(i7, 9) ? "SrcAtop" : AbstractC1362A.j(i7, 10) ? "DstAtop" : AbstractC1362A.j(i7, 11) ? "Xor" : AbstractC1362A.j(i7, 12) ? "Plus" : AbstractC1362A.j(i7, 13) ? "Modulate" : AbstractC1362A.j(i7, 14) ? "Screen" : AbstractC1362A.j(i7, 15) ? "Overlay" : AbstractC1362A.j(i7, 16) ? "Darken" : AbstractC1362A.j(i7, 17) ? "Lighten" : AbstractC1362A.j(i7, 18) ? "ColorDodge" : AbstractC1362A.j(i7, 19) ? "ColorBurn" : AbstractC1362A.j(i7, 20) ? "HardLight" : AbstractC1362A.j(i7, 21) ? "Softlight" : AbstractC1362A.j(i7, 22) ? "Difference" : AbstractC1362A.j(i7, 23) ? "Exclusion" : AbstractC1362A.j(i7, 24) ? "Multiply" : AbstractC1362A.j(i7, 25) ? "Hue" : AbstractC1362A.j(i7, 26) ? "Saturation" : AbstractC1362A.j(i7, 27) ? "Color" : AbstractC1362A.j(i7, 28) ? "Luminosity" : "Unknown"));
        sb2.append(')');
        return sb2.toString();
    }
}
