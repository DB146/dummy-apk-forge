package Ba;

import com.kt.apps.media.xemtv.ui.search.TVSearchActivity;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TVSearchActivity f2262b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(TVSearchActivity tVSearchActivity, int i7) {
        super(0);
        this.f2261a = i7;
        this.f2262b = tVSearchActivity;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f2261a) {
            case 0:
                return this.f2262b.n();
            case 1:
                return this.f2262b.s();
            default:
                return this.f2262b.o();
        }
    }
}
