package A9;

import com.kt.apps.core.base.leanback.SearchBar;
import i1.C1290a;

/* loaded from: classes2.dex */
public final class B2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f772c;

    public /* synthetic */ B2(Object obj, int i7, int i10) {
        this.f770a = i10;
        this.f772c = obj;
        this.f771b = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f770a) {
            case 0:
                SearchBar searchBar = (SearchBar) this.f772c;
                searchBar.f16020H.play(searchBar.f16021I.get(this.f771b), 1.0f, 1.0f, 1, 0, 1.0f);
                return;
            case 1:
                ((com.google.android.gms.common.api.internal.E) this.f772c).f(this.f771b);
                return;
            case 2:
                ((com.google.android.material.datepicker.l) this.f772c).f15327t0.m0(this.f771b);
                return;
            default:
                n1.b bVar = (n1.b) ((C1290a) this.f772c).f18187b;
                if (bVar != null) {
                    bVar.i(this.f771b);
                    return;
                }
                return;
        }
    }
}
