package com.kt.apps.media.xemtv.ui;

import W1.C0558a;
import W1.U;
import android.os.Bundle;
import com.kt.apps.media.xemtv.beta.R;
import va.C2165i;
import y9.AbstractActivityC2461d;

/* loaded from: classes2.dex */
public final class DialogActivity extends AbstractActivityC2461d {
    @Override // y9.AbstractActivityC2461d
    public final int l() {
        return R.layout.activity_dialog;
    }

    @Override // y9.AbstractActivityC2461d
    public final void p(Bundle bundle) {
    }

    @Override // y9.AbstractActivityC2461d
    public final void q() {
        if (getIntent().getIntExtra("extra:res_layout_fragment", R.layout.fragment_add_extensions) == R.layout.fragment_add_extensions) {
            U j = j();
            j.getClass();
            C0558a c0558a = new C0558a(j);
            c0558a.j(R.id.root, new C2165i(), null);
            c0558a.f();
        }
    }
}
