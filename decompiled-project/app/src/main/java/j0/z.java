package j0;

import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public interface z {
    static void a(z zVar, i0.d dVar) {
        y[] yVarArr = y.f18563a;
        C1368f c1368f = (C1368f) zVar;
        if (c1368f.f18540b == null) {
            c1368f.f18540b = new RectF();
        }
        RectF rectF = c1368f.f18540b;
        kotlin.jvm.internal.l.b(rectF);
        float f4 = dVar.f18181d;
        rectF.set(dVar.f18178a, dVar.f18179b, dVar.f18180c, f4);
        if (c1368f.f18541c == null) {
            c1368f.f18541c = new float[8];
        }
        float[] fArr = c1368f.f18541c;
        kotlin.jvm.internal.l.b(fArr);
        long j = dVar.f18182e;
        fArr[0] = Float.intBitsToFloat((int) (j >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j & 4294967295L));
        long j10 = dVar.f18183f;
        fArr[2] = Float.intBitsToFloat((int) (j10 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j10 & 4294967295L));
        long j11 = dVar.g;
        fArr[4] = Float.intBitsToFloat((int) (j11 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j11 & 4294967295L));
        long j12 = dVar.f18184h;
        fArr[6] = Float.intBitsToFloat((int) (j12 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j12 & 4294967295L));
        RectF rectF2 = c1368f.f18540b;
        kotlin.jvm.internal.l.b(rectF2);
        float[] fArr2 = c1368f.f18541c;
        kotlin.jvm.internal.l.b(fArr2);
        c1368f.f18539a.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }
}
