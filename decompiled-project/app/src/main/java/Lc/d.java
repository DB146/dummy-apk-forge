package Lc;

import H2.K;
import H2.i0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.k;
import com.kt.apps.media.xemtv.beta.R;
import java.util.List;
import kotlin.jvm.internal.l;
import tss.r.core.ads.ui.ProductDetailsActivity;

/* loaded from: classes2.dex */
public final class d extends K {

    /* renamed from: d, reason: collision with root package name */
    public final ProductDetailsActivity f6447d;

    /* renamed from: e, reason: collision with root package name */
    public final List f6448e;

    public d(ProductDetailsActivity productDetailsActivity, List imageUrls) {
        l.e(imageUrls, "imageUrls");
        this.f6447d = productDetailsActivity;
        this.f6448e = imageUrls;
    }

    @Override // H2.K
    public final int a() {
        return this.f6448e.size();
    }

    @Override // H2.K
    public final void e(i0 i0Var, int i7) {
        ((k) com.bumptech.glide.b.d(this.f6447d).p((String) this.f6448e.get(i7)).b()).D(((c) i0Var).f6446u);
    }

    @Override // H2.K
    public final i0 g(ViewGroup parent, int i7) {
        l.e(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product_image, parent, false);
        l.b(inflate);
        return new c(inflate);
    }
}
