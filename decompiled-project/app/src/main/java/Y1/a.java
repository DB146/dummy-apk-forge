package Y1;

import N6.y0;
import android.content.Context;
import androidx.work.WorkerParameters;
import h3.y;

/* loaded from: classes.dex */
public final class a extends E6.b {
    public final y0 g;

    public a(y0 y0Var) {
        this.g = y0Var;
    }

    @Override // E6.b
    public final y i(Context context, String str, WorkerParameters workerParameters) {
        Cb.a aVar = (Cb.a) this.g.get(str);
        if (aVar == null) {
            return null;
        }
        return ((b) aVar.get()).a(context, workerParameters);
    }
}
