package C6;

import android.text.Editable;

/* loaded from: classes.dex */
public final class j extends s6.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f2944a;

    public j(m mVar) {
        this.f2944a = mVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f2944a.b().a();
    }

    @Override // s6.n, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        this.f2944a.b().b();
    }
}
