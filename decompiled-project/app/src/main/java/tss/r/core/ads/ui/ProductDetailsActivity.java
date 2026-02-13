package tss.r.core.ads.ui;

import Da.h;
import Eb.v;
import Jc.a;
import Jc.e;
import Lc.d;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.b;
import com.bumptech.glide.k;
import com.kt.apps.media.xemtv.beta.R;
import i.AbstractActivityC1287g;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.l;
import y7.u0;

/* loaded from: classes2.dex */
public final class ProductDetailsActivity extends AbstractActivityC1287g {

    /* renamed from: X, reason: collision with root package name */
    public static final /* synthetic */ int f24545X = 0;

    /* renamed from: O, reason: collision with root package name */
    public TextView f24546O;

    /* renamed from: P, reason: collision with root package name */
    public TextView f24547P;

    /* renamed from: Q, reason: collision with root package name */
    public ImageView f24548Q;

    /* renamed from: R, reason: collision with root package name */
    public ImageView f24549R;

    /* renamed from: S, reason: collision with root package name */
    public RecyclerView f24550S;

    /* renamed from: T, reason: collision with root package name */
    public TextView f24551T;

    /* renamed from: U, reason: collision with root package name */
    public TextView f24552U;

    /* renamed from: V, reason: collision with root package name */
    public TextView f24553V;

    /* renamed from: W, reason: collision with root package name */
    public Button f24554W;

    @Override // W1.G, c.AbstractActivityC0867k, k1.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.activity_product_details);
        this.f24546O = (TextView) findViewById(R.id.product_title);
        this.f24547P = (TextView) findViewById(R.id.product_description);
        this.f24548Q = (ImageView) findViewById(R.id.qr_code_image);
        this.f24549R = (ImageView) findViewById(R.id.product_image);
        this.f24550S = (RecyclerView) findViewById(R.id.product_images_recycler);
        this.f24551T = (TextView) findViewById(R.id.product_price);
        this.f24552U = (TextView) findViewById(R.id.product_sale_price);
        this.f24553V = (TextView) findViewById(R.id.product_sale_percentage);
        this.f24554W = (Button) findViewById(R.id.buy_button);
        e eVar = (e) getIntent().getParcelableExtra("extra_banner_ad");
        if (eVar == null) {
            finish();
            return;
        }
        String str2 = eVar.f5810D;
        String str3 = eVar.f5811E;
        String str4 = eVar.f5812a;
        String str5 = eVar.f5813b;
        String str6 = eVar.f5814c;
        String str7 = eVar.f5815d;
        Double d10 = eVar.f5816e;
        String str8 = eVar.f5817f;
        String str9 = eVar.f5818u;
        String str10 = eVar.f5819v;
        String str11 = eVar.f5820w;
        Integer num = eVar.f5821x;
        Double d11 = eVar.f5822y;
        String str12 = eVar.f5823z;
        String str13 = eVar.f5807A;
        String str14 = eVar.f5808B;
        List list = eVar.f5809C;
        a aVar = new a(str4, str5, str6, str7, d10, str8, str9, str10, str11, num, d11, str12, str13, str14, list, str2, str3);
        TextView textView = this.f24546O;
        if (textView == null) {
            l.j("productTitle");
            throw null;
        }
        textView.setText(str6);
        TextView textView2 = this.f24547P;
        if (textView2 == null) {
            l.j("productDescription");
            throw null;
        }
        textView2.setText(str7);
        Button button = this.f24554W;
        if (button == null) {
            l.j("buyButton");
            throw null;
        }
        button.setOnClickListener(new h(2, aVar, this));
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
        if (d10 != null) {
            TextView textView3 = this.f24551T;
            if (textView3 == null) {
                l.j("productPrice");
                throw null;
            }
            textView3.setVisibility(0);
            TextView textView4 = this.f24551T;
            if (textView4 == null) {
                l.j("productPrice");
                throw null;
            }
            textView4.setText(currencyInstance.format(d10.doubleValue()));
            if (d11 == null || num == null) {
                TextView textView5 = this.f24552U;
                if (textView5 == null) {
                    l.j("productSalePrice");
                    throw null;
                }
                textView5.setVisibility(8);
                TextView textView6 = this.f24553V;
                if (textView6 == null) {
                    l.j("productSalePercentage");
                    throw null;
                }
                textView6.setVisibility(8);
                TextView textView7 = this.f24551T;
                if (textView7 == null) {
                    l.j("productPrice");
                    throw null;
                }
                textView7.setPaintFlags(textView7.getPaintFlags() & (-17));
            } else {
                TextView textView8 = this.f24552U;
                if (textView8 == null) {
                    l.j("productSalePrice");
                    throw null;
                }
                textView8.setVisibility(0);
                TextView textView9 = this.f24552U;
                if (textView9 == null) {
                    l.j("productSalePrice");
                    throw null;
                }
                textView9.setText(currencyInstance.format(d11.doubleValue()));
                TextView textView10 = this.f24553V;
                if (textView10 == null) {
                    l.j("productSalePercentage");
                    throw null;
                }
                textView10.setVisibility(0);
                TextView textView11 = this.f24553V;
                if (textView11 == null) {
                    l.j("productSalePercentage");
                    throw null;
                }
                textView11.setText("-" + num + "%");
                TextView textView12 = this.f24551T;
                if (textView12 == null) {
                    l.j("productPrice");
                    throw null;
                }
                textView12.setPaintFlags(textView12.getPaintFlags() | 16);
            }
        } else {
            TextView textView13 = this.f24551T;
            if (textView13 == null) {
                l.j("productPrice");
                throw null;
            }
            textView13.setVisibility(8);
            TextView textView14 = this.f24552U;
            if (textView14 == null) {
                l.j("productSalePrice");
                throw null;
            }
            textView14.setVisibility(8);
            TextView textView15 = this.f24553V;
            if (textView15 == null) {
                l.j("productSalePercentage");
                throw null;
            }
            textView15.setVisibility(8);
        }
        k p10 = b.b(this).d(this).p(str9);
        ImageView imageView = this.f24548Q;
        if (imageView == null) {
            l.j("qrCodeImage");
            throw null;
        }
        p10.D(imageView);
        if (str12 != null) {
            str = str12;
            k kVar = (k) b.b(this).d(this).p(str).b();
            ImageView imageView2 = this.f24549R;
            if (imageView2 == null) {
                l.j("productImage");
                throw null;
            }
            kVar.D(imageView2);
        } else {
            str = str12;
        }
        if (list == null || list.isEmpty()) {
            list = str != null ? u0.x(str) : v.f3891a;
        }
        if (list.isEmpty()) {
            RecyclerView recyclerView = this.f24550S;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
                return;
            } else {
                l.j("productImagesRecycler");
                throw null;
            }
        }
        d dVar = new d(this, list);
        RecyclerView recyclerView2 = this.f24550S;
        if (recyclerView2 == null) {
            l.j("productImagesRecycler");
            throw null;
        }
        recyclerView2.setAdapter(dVar);
        RecyclerView recyclerView3 = this.f24550S;
        if (recyclerView3 != null) {
            recyclerView3.setVisibility(0);
        } else {
            l.j("productImagesRecycler");
            throw null;
        }
    }
}
