package Lc;

import H2.i0;
import android.view.View;
import android.widget.ImageView;
import com.kt.apps.media.xemtv.beta.R;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class c extends i0 {

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f6446u;

    public c(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.product_image);
        l.d(findViewById, "findViewById(...)");
        this.f6446u = (ImageView) findViewById;
    }
}
