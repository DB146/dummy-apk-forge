package C6;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class d extends n {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2928e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(m mVar, int i7) {
        super(mVar);
        this.f2928e = i7;
    }

    @Override // C6.n
    public void r() {
        switch (this.f2928e) {
            case 0:
                m mVar = this.f2973b;
                mVar.f2952C = null;
                CheckableImageButton checkableImageButton = mVar.f2966u;
                checkableImageButton.setOnLongClickListener(null);
                Tb.a.J(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
