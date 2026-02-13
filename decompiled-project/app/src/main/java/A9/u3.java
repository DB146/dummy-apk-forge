package A9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kt.apps.core.base.leanback.VerticalGridView;
import com.kt.apps.media.xemtv.beta.R;
import f2.C1129a;

/* loaded from: classes2.dex */
public final class u3 extends AbstractC0113m2 {

    /* renamed from: b, reason: collision with root package name */
    public int f1413b = R.layout.lb_vertical_grid;

    /* renamed from: c, reason: collision with root package name */
    public int f1414c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1415d = true;

    /* renamed from: e, reason: collision with root package name */
    public O1 f1416e;

    /* renamed from: f, reason: collision with root package name */
    public N1 f1417f;
    public e3 g;

    /* renamed from: h, reason: collision with root package name */
    public T f1418h;

    @Override // A9.AbstractC0113m2
    public final void c(C0109l2 c0109l2, Object obj) {
        t3 t3Var = (t3) c0109l2;
        t3Var.f1375b.s((J1) obj);
        t3Var.f1376c.setAdapter(t3Var.f1375b);
    }

    @Override // A9.AbstractC0113m2
    public final void e(C0109l2 c0109l2) {
        t3 t3Var = (t3) c0109l2;
        t3Var.f1375b.s(null);
        t3Var.f1376c.setAdapter(null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [A9.x0, java.lang.Object] */
    @Override // A9.AbstractC0113m2
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final t3 d(ViewGroup viewGroup) {
        VerticalGridView verticalGridView = (VerticalGridView) LayoutInflater.from(viewGroup.getContext()).inflate(this.f1413b, viewGroup, false).findViewById(R.id.browse_grid);
        t3 t3Var = new t3(verticalGridView);
        t3Var.f1377d = false;
        t3Var.f1375b = new s3(this);
        int i7 = this.f1414c;
        if (i7 == -1) {
            throw new IllegalStateException("Number of columns must be set");
        }
        verticalGridView.setNumColumns(i7);
        t3Var.f1377d = true;
        Context context = verticalGridView.getContext();
        if (this.g == null) {
            c3 c3Var = new c3();
            c3Var.f1093a = false;
            c3Var.f1095c = this.f1415d;
            c3Var.f1094b = true;
            c3Var.f1096d = !C1129a.a(context).f16936a;
            c3Var.f1097e = true;
            c3Var.f1098f = d3.f1110a;
            e3 a9 = c3Var.a(context);
            this.g = a9;
            if (a9.f1130e) {
                this.f1418h = new T(a9);
            }
        }
        t3Var.f1375b.f1362e = this.f1418h;
        if (this.g.f1126a == 2) {
            verticalGridView.setLayoutMode(1);
        }
        verticalGridView.setFocusDrawingOrderEnabled(this.g.f1126a != 3);
        s3 s3Var = t3Var.f1375b;
        ?? obj = new Object();
        obj.f1468a = 2;
        s3Var.f1363f = obj;
        verticalGridView.setOnChildSelectedListener(new q3.e(2, this, t3Var, false));
        if (t3Var.f1377d) {
            return t3Var;
        }
        throw new RuntimeException("super.initializeGridViewHolder() must be called");
    }

    public final void j(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Invalid number of columns");
        }
        if (this.f1414c != i7) {
            this.f1414c = i7;
        }
    }
}
