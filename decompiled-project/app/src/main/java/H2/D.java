package H2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class D extends E {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4585d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(androidx.recyclerview.widget.a aVar, int i7) {
        super(aVar);
        this.f4585d = i7;
    }

    @Override // H2.E
    public final int d(View view) {
        switch (this.f4585d) {
            case 0:
                return ((androidx.recyclerview.widget.a) this.f4587b).G(view) + ((ViewGroup.MarginLayoutParams) ((T) view.getLayoutParams())).rightMargin;
            default:
                return ((androidx.recyclerview.widget.a) this.f4587b).B(view) + ((ViewGroup.MarginLayoutParams) ((T) view.getLayoutParams())).bottomMargin;
        }
    }

    @Override // H2.E
    public final int e(View view) {
        switch (this.f4585d) {
            case 0:
                T t5 = (T) view.getLayoutParams();
                ((androidx.recyclerview.widget.a) this.f4587b).getClass();
                return androidx.recyclerview.widget.a.F(view) + ((ViewGroup.MarginLayoutParams) t5).leftMargin + ((ViewGroup.MarginLayoutParams) t5).rightMargin;
            default:
                T t10 = (T) view.getLayoutParams();
                ((androidx.recyclerview.widget.a) this.f4587b).getClass();
                return androidx.recyclerview.widget.a.E(view) + ((ViewGroup.MarginLayoutParams) t10).topMargin + ((ViewGroup.MarginLayoutParams) t10).bottomMargin;
        }
    }

    @Override // H2.E
    public final int f(View view) {
        switch (this.f4585d) {
            case 0:
                T t5 = (T) view.getLayoutParams();
                ((androidx.recyclerview.widget.a) this.f4587b).getClass();
                return androidx.recyclerview.widget.a.E(view) + ((ViewGroup.MarginLayoutParams) t5).topMargin + ((ViewGroup.MarginLayoutParams) t5).bottomMargin;
            default:
                T t10 = (T) view.getLayoutParams();
                ((androidx.recyclerview.widget.a) this.f4587b).getClass();
                return androidx.recyclerview.widget.a.F(view) + ((ViewGroup.MarginLayoutParams) t10).leftMargin + ((ViewGroup.MarginLayoutParams) t10).rightMargin;
        }
    }

    @Override // H2.E
    public final int g(View view) {
        switch (this.f4585d) {
            case 0:
                return ((androidx.recyclerview.widget.a) this.f4587b).D(view) - ((ViewGroup.MarginLayoutParams) ((T) view.getLayoutParams())).leftMargin;
            default:
                return ((androidx.recyclerview.widget.a) this.f4587b).H(view) - ((ViewGroup.MarginLayoutParams) ((T) view.getLayoutParams())).topMargin;
        }
    }

    @Override // H2.E
    public final int h() {
        switch (this.f4585d) {
            case 0:
                return ((androidx.recyclerview.widget.a) this.f4587b).f13717n;
            default:
                return ((androidx.recyclerview.widget.a) this.f4587b).f13718o;
        }
    }

    @Override // H2.E
    public final int i() {
        switch (this.f4585d) {
            case 0:
                androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) this.f4587b;
                return aVar.f13717n - aVar.M();
            default:
                androidx.recyclerview.widget.a aVar2 = (androidx.recyclerview.widget.a) this.f4587b;
                return aVar2.f13718o - aVar2.K();
        }
    }

    @Override // H2.E
    public final int j() {
        switch (this.f4585d) {
            case 0:
                return ((androidx.recyclerview.widget.a) this.f4587b).M();
            default:
                return ((androidx.recyclerview.widget.a) this.f4587b).K();
        }
    }

    @Override // H2.E
    public final int k() {
        switch (this.f4585d) {
            case 0:
                return ((androidx.recyclerview.widget.a) this.f4587b).f13715l;
            default:
                return ((androidx.recyclerview.widget.a) this.f4587b).f13716m;
        }
    }

    @Override // H2.E
    public final int l() {
        switch (this.f4585d) {
            case 0:
                return ((androidx.recyclerview.widget.a) this.f4587b).f13716m;
            default:
                return ((androidx.recyclerview.widget.a) this.f4587b).f13715l;
        }
    }

    @Override // H2.E
    public final int m() {
        switch (this.f4585d) {
            case 0:
                return ((androidx.recyclerview.widget.a) this.f4587b).L();
            default:
                return ((androidx.recyclerview.widget.a) this.f4587b).N();
        }
    }

    @Override // H2.E
    public final int n() {
        switch (this.f4585d) {
            case 0:
                androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) this.f4587b;
                return (aVar.f13717n - aVar.L()) - aVar.M();
            default:
                androidx.recyclerview.widget.a aVar2 = (androidx.recyclerview.widget.a) this.f4587b;
                return (aVar2.f13718o - aVar2.N()) - aVar2.K();
        }
    }

    @Override // H2.E
    public final int p(View view) {
        switch (this.f4585d) {
            case 0:
                androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) this.f4587b;
                Rect rect = (Rect) this.f4588c;
                aVar.R(rect, view);
                return rect.right;
            default:
                androidx.recyclerview.widget.a aVar2 = (androidx.recyclerview.widget.a) this.f4587b;
                Rect rect2 = (Rect) this.f4588c;
                aVar2.R(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // H2.E
    public final int q(View view) {
        switch (this.f4585d) {
            case 0:
                androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) this.f4587b;
                Rect rect = (Rect) this.f4588c;
                aVar.R(rect, view);
                return rect.left;
            default:
                androidx.recyclerview.widget.a aVar2 = (androidx.recyclerview.widget.a) this.f4587b;
                Rect rect2 = (Rect) this.f4588c;
                aVar2.R(rect2, view);
                return rect2.top;
        }
    }

    @Override // H2.E
    public final void r(int i7) {
        switch (this.f4585d) {
            case 0:
                ((androidx.recyclerview.widget.a) this.f4587b).X(i7);
                return;
            default:
                ((androidx.recyclerview.widget.a) this.f4587b).Y(i7);
                return;
        }
    }
}
