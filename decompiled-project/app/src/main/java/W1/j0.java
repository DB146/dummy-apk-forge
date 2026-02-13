package W1;

import Y5.U0;
import android.view.View;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import y1.AbstractC2352B;

/* loaded from: classes.dex */
public final class j0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10492a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10493b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10494c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f10495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f10497f;

    public j0(int i7, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f10493b = i7;
        this.f10494c = arrayList;
        this.f10495d = arrayList2;
        this.f10496e = arrayList3;
        this.f10497f = arrayList4;
    }

    public /* synthetic */ j0(Y5.Z z8, int i7, IOException iOException, byte[] bArr, Map map) {
        this.f10494c = z8;
        this.f10493b = i7;
        this.f10495d = iOException;
        this.f10496e = bArr;
        this.f10497f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f10493b;
        Object obj = this.f10496e;
        Serializable serializable = this.f10495d;
        Object obj2 = this.f10494c;
        switch (this.f10492a) {
            case 0:
                for (int i10 = 0; i10 < i7; i10++) {
                    View view = (View) ((ArrayList) obj2).get(i10);
                    String str = (String) ((ArrayList) serializable).get(i10);
                    WeakHashMap weakHashMap = y1.K.f26642a;
                    AbstractC2352B.m(view, str);
                    AbstractC2352B.m((View) ((ArrayList) obj).get(i10), (String) ((ArrayList) this.f10497f).get(i10));
                }
                return;
            default:
                ((U0) ((Y5.Z) obj2).f11608e).c(i7, (IOException) serializable, (byte[]) obj);
                return;
        }
    }
}
