package m6;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import s6.l;
import s6.m;

/* renamed from: m6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1626b extends Y6.b {
    public final /* synthetic */ int k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f20689l;

    public /* synthetic */ C1626b(Object obj, int i7) {
        this.k = i7;
        this.f20689l = obj;
    }

    private final void B(int i7) {
    }

    @Override // Y6.b
    public final void t(int i7) {
        switch (this.k) {
            case 0:
                return;
            default:
                m mVar = (m) this.f20689l;
                mVar.f24178e = true;
                l lVar = (l) mVar.f24179f.get();
                if (lVar != null) {
                    lVar.a();
                    return;
                }
                return;
        }
    }

    @Override // Y6.b
    public final void u(Typeface typeface, boolean z8) {
        switch (this.k) {
            case 0:
                Chip chip = (Chip) this.f20689l;
                C1630f c1630f = chip.f15277e;
                chip.setText(c1630f.f20714Q0 ? c1630f.f20717S : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (z8) {
                    return;
                }
                m mVar = (m) this.f20689l;
                mVar.f24178e = true;
                l lVar = (l) mVar.f24179f.get();
                if (lVar != null) {
                    lVar.a();
                    return;
                }
                return;
        }
    }
}
