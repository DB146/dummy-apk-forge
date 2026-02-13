package H2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4598a;

    public /* synthetic */ J(RecyclerView recyclerView) {
        this.f4598a = recyclerView;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(i0 i0Var, O o10, O o11) {
        boolean z8;
        RecyclerView recyclerView = this.f4598a;
        recyclerView.getClass();
        i0Var.q(false);
        C0296j c0296j = (C0296j) recyclerView.f13654d0;
        if (o10 != null) {
            c0296j.getClass();
            int i7 = o10.f4603b;
            int i10 = o11.f4603b;
            if (i7 != i10 || o10.f4604c != o11.f4604c) {
                z8 = c0296j.g(i0Var, i7, o10.f4604c, i10, o11.f4604c);
                if (z8) {
                    return;
                }
                recyclerView.X();
                return;
            }
        }
        c0296j.l(i0Var);
        i0Var.f4707a.setAlpha(0.0f);
        c0296j.f4725i.add(i0Var);
        z8 = true;
        if (z8) {
        }
    }

    public void b(i0 i0Var, O o10, O o11) {
        boolean z8;
        RecyclerView recyclerView = this.f4598a;
        recyclerView.f13651c.m(i0Var);
        recyclerView.h(i0Var);
        i0Var.q(false);
        C0296j c0296j = (C0296j) recyclerView.f13654d0;
        c0296j.getClass();
        int i7 = o10.f4603b;
        int i10 = o10.f4604c;
        View view = i0Var.f4707a;
        int left = o11 == null ? view.getLeft() : o11.f4603b;
        int top = o11 == null ? view.getTop() : o11.f4604c;
        if (i0Var.k() || (i7 == left && i10 == top)) {
            c0296j.l(i0Var);
            c0296j.f4724h.add(i0Var);
            z8 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z8 = c0296j.g(i0Var, i7, i10, left, top);
        }
        if (z8) {
            recyclerView.X();
        }
    }
}
