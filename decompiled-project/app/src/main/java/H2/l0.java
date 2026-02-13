package H2;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class l0 extends V {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4742a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f4743b;

    public l0(G g) {
        this.f4743b = g;
    }

    @Override // H2.V
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 0 && this.f4742a) {
            this.f4742a = false;
            this.f4743b.f();
        }
    }

    @Override // H2.V
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        if (i7 == 0 && i10 == 0) {
            return;
        }
        this.f4742a = true;
    }
}
