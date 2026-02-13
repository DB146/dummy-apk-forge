package W0;

import U9.i;
import java.util.Arrays;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f10254a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f10255b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f10254a = fArr;
        this.f10255b = fArr2;
    }

    @Override // W0.a
    public final float a(float f4) {
        return i.f(f4, this.f10255b, this.f10254a);
    }

    @Override // W0.a
    public final float b(float f4) {
        return i.f(f4, this.f10254a, this.f10255b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f10254a, cVar.f10254a) && Arrays.equals(this.f10255b, cVar.f10255b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10255b) + (Arrays.hashCode(this.f10254a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f10254a);
        l.d(arrays, "toString(...)");
        sb2.append(arrays);
        sb2.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f10255b);
        l.d(arrays2, "toString(...)");
        sb2.append(arrays2);
        sb2.append('}');
        return sb2.toString();
    }
}
