package com.kt.apps.media.xemtv.ui.details;

import W1.C0558a;
import W1.G;
import W1.U;
import android.os.Bundle;
import com.kt.apps.media.xemtv.beta.R;
import ua.e;

/* loaded from: classes2.dex */
public final class DetailsActivity extends G {
    @Override // W1.G, c.AbstractActivityC0867k, k1.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_details);
        if (bundle == null) {
            U j = j();
            j.getClass();
            C0558a c0558a = new C0558a(j);
            c0558a.j(R.id.details_fragment, new e(), null);
            c0558a.f();
        }
    }
}
