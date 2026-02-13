package com.google.android.tv.ads.controls;

import K6.b;
import K6.c;
import W1.C0558a;
import W1.U;
import android.net.Uri;
import android.os.Bundle;
import i.AbstractActivityC1287g;

/* loaded from: classes.dex */
public final class FallbackImageActivity extends AbstractActivityC1287g {
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.AbstractCollection, java.util.List] */
    @Override // W1.G, c.AbstractActivityC0867k, k1.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c cVar;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        boolean z8 = extras != null && extras.getBoolean("render_error_message");
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null && (cVar = (c) extras2.getParcelable("icon_click_fallback_images")) != null) {
            for (b bVar : cVar.f6195a) {
                String queryParameter = Uri.parse(bVar.f6194e).getQueryParameter("atvatc");
                if (queryParameter == null || !queryParameter.equals("1")) {
                    break;
                }
            }
        }
        bVar = null;
        if (z8 || bVar == null) {
            U j = j();
            j.getClass();
            C0558a c0558a = new C0558a(j);
            c0558a.f10421r = true;
            c0558a.k(null, ErrorMessageFragment.class);
            c0558a.e(false);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("wta_uri", bVar.f6194e);
        bundle2.putString("wta_alt_text", bVar.f6192c);
        U j10 = j();
        j10.getClass();
        C0558a c0558a2 = new C0558a(j10);
        c0558a2.f10421r = true;
        c0558a2.k(bundle2, WhyThisAdFragment.class);
        c0558a2.e(false);
    }
}
