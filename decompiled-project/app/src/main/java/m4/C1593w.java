package m4;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.kt.apps.media.xemtv.App;

/* renamed from: m4.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1593w implements n5.i, OnFailureListener, z1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20512b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20513c;

    public /* synthetic */ C1593w(int i7, ya.j jVar) {
        this.f20511a = 2;
        this.f20512b = i7;
        this.f20513c = jVar;
    }

    public /* synthetic */ C1593w(Object obj, int i7, int i10) {
        this.f20511a = i10;
        this.f20513c = obj;
        this.f20512b = i7;
    }

    @Override // z1.o
    public boolean d(View view) {
        ((SideSheetBehavior) this.f20513c).v(this.f20512b);
        return true;
    }

    @Override // n5.i
    public void invoke(Object obj) {
        ((v0) obj).c((C1558a0) this.f20513c, this.f20512b);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception it) {
        switch (this.f20511a) {
            case 1:
                kotlin.jvm.internal.l.e(it, "it");
                App t5 = (App) this.f20513c;
                kotlin.jvm.internal.l.e(t5, "t");
                t5.b(this.f20512b - 1);
                return;
            default:
                kotlin.jvm.internal.l.e(it, "it");
                int i7 = this.f20512b;
                if (i7 > 0) {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1559b((ya.j) this.f20513c, i7, 2), 2000L);
                    return;
                }
                return;
        }
    }
}
