package Lc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.k;
import com.kt.apps.media.xemtv.beta.R;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class g extends ConstraintLayout {

    /* renamed from: E, reason: collision with root package name */
    public final ImageView f6451E;

    /* renamed from: F, reason: collision with root package name */
    public final ImageView f6452F;

    /* renamed from: G, reason: collision with root package name */
    public final TextView f6453G;

    /* renamed from: H, reason: collision with root package name */
    public final TextView f6454H;

    /* renamed from: I, reason: collision with root package name */
    public final TextView f6455I;

    /* renamed from: J, reason: collision with root package name */
    public final TextView f6456J;

    /* renamed from: K, reason: collision with root package name */
    public final TextView f6457K;
    public final Button L;

    /* renamed from: M, reason: collision with root package name */
    public Jc.a f6458M;

    /* renamed from: N, reason: collision with root package name */
    public f f6459N;

    public g(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.view_tv_banner_ad, (ViewGroup) this, true);
        this.f6451E = (ImageView) findViewById(R.id.product_image);
        this.f6452F = (ImageView) findViewById(R.id.qr_code_image);
        this.f6453G = (TextView) findViewById(R.id.product_title);
        this.f6454H = (TextView) findViewById(R.id.product_description);
        this.f6455I = (TextView) findViewById(R.id.product_price);
        this.f6456J = (TextView) findViewById(R.id.product_sale_price);
        this.f6457K = (TextView) findViewById(R.id.product_sale_percentage);
        this.L = (Button) findViewById(R.id.cta_button);
        final int i7 = 0;
        setOnClickListener(new View.OnClickListener(this) { // from class: Lc.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f6450b;

            {
                this.f6450b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f fVar;
                f fVar2;
                switch (i7) {
                    case 0:
                        g gVar = this.f6450b;
                        Jc.a aVar = gVar.f6458M;
                        if (aVar == null || (fVar = gVar.f6459N) == null) {
                            return;
                        }
                        fVar.e(aVar);
                        return;
                    default:
                        g gVar2 = this.f6450b;
                        Jc.a aVar2 = gVar2.f6458M;
                        if (aVar2 == null || (fVar2 = gVar2.f6459N) == null) {
                            return;
                        }
                        fVar2.a(aVar2);
                        return;
                }
            }
        });
        Button button = this.L;
        if (button == null) {
            l.j("ctaButton");
            throw null;
        }
        final int i10 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: Lc.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f6450b;

            {
                this.f6450b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f fVar;
                f fVar2;
                switch (i10) {
                    case 0:
                        g gVar = this.f6450b;
                        Jc.a aVar = gVar.f6458M;
                        if (aVar == null || (fVar = gVar.f6459N) == null) {
                            return;
                        }
                        fVar.e(aVar);
                        return;
                    default:
                        g gVar2 = this.f6450b;
                        Jc.a aVar2 = gVar2.f6458M;
                        if (aVar2 == null || (fVar2 = gVar2.f6459N) == null) {
                            return;
                        }
                        fVar2.a(aVar2);
                        return;
                }
            }
        });
    }

    public final void m(Jc.a ad) {
        Integer num;
        l.e(ad, "ad");
        this.f6458M = ad;
        TextView textView = this.f6453G;
        if (textView == null) {
            l.j("productTitle");
            throw null;
        }
        textView.setText(ad.f5781c);
        TextView textView2 = this.f6454H;
        if (textView2 == null) {
            l.j("productDescription");
            throw null;
        }
        textView2.setText(ad.f5782d);
        Button button = this.L;
        if (button == null) {
            l.j("ctaButton");
            throw null;
        }
        button.setText(ad.f5786v);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
        Double d10 = ad.f5783e;
        if (d10 != null) {
            TextView textView3 = this.f6455I;
            if (textView3 == null) {
                l.j("productPrice");
                throw null;
            }
            textView3.setVisibility(0);
            TextView textView4 = this.f6455I;
            if (textView4 == null) {
                l.j("productPrice");
                throw null;
            }
            textView4.setText(currencyInstance.format(d10.doubleValue()));
            Double d11 = ad.f5789y;
            if (d11 == null || (num = ad.f5788x) == null) {
                TextView textView5 = this.f6456J;
                if (textView5 == null) {
                    l.j("productSalePrice");
                    throw null;
                }
                textView5.setVisibility(8);
                TextView textView6 = this.f6457K;
                if (textView6 == null) {
                    l.j("productSalePercentage");
                    throw null;
                }
                textView6.setVisibility(8);
                TextView textView7 = this.f6455I;
                if (textView7 == null) {
                    l.j("productPrice");
                    throw null;
                }
                textView7.setPaintFlags(textView7.getPaintFlags() & (-17));
            } else {
                TextView textView8 = this.f6456J;
                if (textView8 == null) {
                    l.j("productSalePrice");
                    throw null;
                }
                textView8.setVisibility(0);
                TextView textView9 = this.f6456J;
                if (textView9 == null) {
                    l.j("productSalePrice");
                    throw null;
                }
                textView9.setText(currencyInstance.format(d11.doubleValue()));
                TextView textView10 = this.f6457K;
                if (textView10 == null) {
                    l.j("productSalePercentage");
                    throw null;
                }
                textView10.setVisibility(0);
                TextView textView11 = this.f6457K;
                if (textView11 == null) {
                    l.j("productSalePercentage");
                    throw null;
                }
                textView11.setText("-" + num + "%");
                TextView textView12 = this.f6455I;
                if (textView12 == null) {
                    l.j("productPrice");
                    throw null;
                }
                textView12.setPaintFlags(textView12.getPaintFlags() | 16);
            }
        } else {
            TextView textView13 = this.f6455I;
            if (textView13 == null) {
                l.j("productPrice");
                throw null;
            }
            textView13.setVisibility(8);
            TextView textView14 = this.f6456J;
            if (textView14 == null) {
                l.j("productSalePrice");
                throw null;
            }
            textView14.setVisibility(8);
            TextView textView15 = this.f6457K;
            if (textView15 == null) {
                l.j("productSalePercentage");
                throw null;
            }
            textView15.setVisibility(8);
        }
        String str = ad.f5790z;
        if (str != null) {
            k kVar = (k) com.bumptech.glide.b.d(getContext()).p(str).b();
            ImageView imageView = this.f6451E;
            if (imageView == null) {
                l.j("productImage");
                throw null;
            }
            kVar.D(imageView);
        }
        k p10 = com.bumptech.glide.b.d(getContext()).p(ad.f5785u);
        ImageView imageView2 = this.f6452F;
        if (imageView2 != null) {
            p10.D(imageView2);
        } else {
            l.j("qrCodeImage");
            throw null;
        }
    }

    public final void setAdClickListener(f listener) {
        l.e(listener, "listener");
        this.f6459N = listener;
    }
}
