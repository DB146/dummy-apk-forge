package A9;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kt.apps.core.base.leanback.SeekBar;
import com.kt.apps.core.base.leanback.ThumbsBar;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;

/* renamed from: A9.j2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0101j2 extends C0152w2 implements InterfaceC0069b2 {

    /* renamed from: A, reason: collision with root package name */
    public C0067b0 f1238A;

    /* renamed from: B, reason: collision with root package name */
    public C0067b0 f1239B;

    /* renamed from: C, reason: collision with root package name */
    public final C0093h2 f1240C;

    /* renamed from: D, reason: collision with root package name */
    public final C0093h2 f1241D;

    /* renamed from: E, reason: collision with root package name */
    public C0109l2 f1242E;

    /* renamed from: F, reason: collision with root package name */
    public Object f1243F;

    /* renamed from: G, reason: collision with root package name */
    public Y1 f1244G;

    /* renamed from: H, reason: collision with root package name */
    public C0073c2 f1245H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1246I;

    /* renamed from: J, reason: collision with root package name */
    public final C0089g2 f1247J;

    /* renamed from: K, reason: collision with root package name */
    public final /* synthetic */ C9.d f1248K;

    /* renamed from: o, reason: collision with root package name */
    public final C0109l2 f1249o;

    /* renamed from: p, reason: collision with root package name */
    public final ImageView f1250p;

    /* renamed from: q, reason: collision with root package name */
    public final ViewGroup f1251q;

    /* renamed from: r, reason: collision with root package name */
    public final ViewGroup f1252r;

    /* renamed from: s, reason: collision with root package name */
    public final ViewGroup f1253s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f1254t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f1255u;

    /* renamed from: v, reason: collision with root package name */
    public final SeekBar f1256v;

    /* renamed from: w, reason: collision with root package name */
    public final ThumbsBar f1257w;

    /* renamed from: x, reason: collision with root package name */
    public long f1258x;

    /* renamed from: y, reason: collision with root package name */
    public long f1259y;

    /* renamed from: z, reason: collision with root package name */
    public final StringBuilder f1260z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, A9.h2] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, A9.h2] */
    public C0101j2(C9.d dVar, View view, C0107l0 c0107l0) {
        super(view);
        this.f1248K = dVar;
        this.f1258x = Long.MIN_VALUE;
        this.f1259y = Long.MIN_VALUE;
        this.f1260z = new StringBuilder();
        this.f1240C = new Object();
        this.f1241D = new Object();
        this.f1247J = new C0089g2(this);
        this.f1250p = (ImageView) view.findViewById(R.id.image);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.description_dock);
        this.f1251q = viewGroup;
        this.f1255u = (TextView) view.findViewById(R.id.current_time);
        this.f1254t = (TextView) view.findViewById(R.id.total_time);
        SeekBar seekBar = (SeekBar) view.findViewById(R.id.playback_progress);
        this.f1256v = seekBar;
        int i7 = 1;
        seekBar.setOnClickListener(new Q0(this, i7));
        seekBar.setOnKeyListener(new ViewOnKeyListenerC0127q0(this, i7));
        seekBar.setAccessibilitySeekListener(new C0097i2(this));
        seekBar.setMax(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        this.f1252r = (ViewGroup) view.findViewById(R.id.controls_dock);
        this.f1253s = (ViewGroup) view.findViewById(R.id.secondary_controls_dock);
        C0109l2 d10 = c0107l0 == null ? null : c0107l0.d(viewGroup);
        this.f1249o = d10;
        if (d10 != null) {
            viewGroup.addView(d10.f1271a);
        }
        this.f1257w = (ThumbsBar) view.findViewById(R.id.thumbs_row);
    }

    @Override // A9.InterfaceC0069b2
    public final void a(Tb.a aVar) {
        this.f1245H = (C0073c2) aVar;
    }

    public final void c() {
        if (this.g) {
            C0109l2 c0109l2 = this.f1242E;
            if (c0109l2 == null) {
                InterfaceC0153x interfaceC0153x = this.f1466m;
                if (interfaceC0153x != null) {
                    interfaceC0153x.a(null, null, this, this.f1460d);
                    return;
                }
                return;
            }
            InterfaceC0153x interfaceC0153x2 = this.f1466m;
            if (interfaceC0153x2 != null) {
                interfaceC0153x2.a(c0109l2, this.f1243F, this, this.f1460d);
            }
        }
    }

    public final AbstractC0113m2 d(boolean z8) {
        C0098j c0098j = z8 ? ((Z1) this.f1460d).f1043c : ((Z1) this.f1460d).f1044d;
        if (c0098j == null) {
            return null;
        }
        AbstractC0117n2 abstractC0117n2 = c0098j.f852b;
        if (abstractC0117n2 instanceof C0083f0) {
            return ((C0083f0) abstractC0117n2).f1136b;
        }
        ArrayList arrayList = c0098j.f1233c;
        Object obj = arrayList.size() > 0 ? arrayList.get(0) : null;
        AbstractC0117n2 abstractC0117n22 = c0098j.f852b;
        if (abstractC0117n22 != null) {
            return abstractC0117n22.a(obj);
        }
        throw new IllegalStateException("Presenter selector must not be null");
    }

    public final void e(long j) {
        if (j != this.f1259y) {
            this.f1259y = j;
            TextView textView = this.f1255u;
            if (textView != null) {
                StringBuilder sb2 = this.f1260z;
                C9.d.y(j, sb2);
                textView.setText(sb2.toString());
            }
        }
        if (this.f1246I) {
            return;
        }
        long j10 = this.f1258x;
        this.f1256v.setProgress(j10 > 0 ? (int) ((this.f1259y / j10) * 2.147483647E9d) : 0);
    }

    public final boolean f() {
        if (this.f1246I) {
            return true;
        }
        C0073c2 c0073c2 = this.f1245H;
        if (c0073c2 == null || !c0073c2.v() || this.f1258x <= 0) {
            return false;
        }
        this.f1246I = true;
        this.f1245H.A();
        this.f1245H.s();
        this.f1238A.f1271a.setVisibility(8);
        this.f1239B.f1271a.setVisibility(4);
        this.f1249o.f1271a.setVisibility(4);
        this.f1257w.setVisibility(0);
        return true;
    }

    public final void g(boolean z8) {
        if (!this.f1246I) {
            return;
        }
        this.f1246I = false;
        this.f1245H.y(z8);
        int i7 = 0;
        while (true) {
            ThumbsBar thumbsBar = this.f1257w;
            if (i7 >= thumbsBar.getChildCount()) {
                thumbsBar.f16106u.clear();
                this.f1238A.f1271a.setVisibility(0);
                this.f1239B.f1271a.setVisibility(0);
                this.f1249o.f1271a.setVisibility(0);
                thumbsBar.setVisibility(4);
                return;
            }
            thumbsBar.f16106u.put(i7, null);
            ((ImageView) thumbsBar.getChildAt(i7)).setImageBitmap(null);
            i7++;
        }
    }

    public final void h(boolean z8) {
        long j = this.f1259y;
        long j10 = this.f1258x;
        long j11 = ((float) j10) * this.f1248K.f3081e;
        if (!z8) {
            j11 = -j11;
        }
        long j12 = j + j11;
        if (j12 > j10) {
            j12 = j10;
        } else if (j12 < 0) {
            j12 = 0;
        }
        this.f1256v.setProgress((int) ((j12 / j10) * 2.147483647E9d));
        this.f1245H.z(j12);
    }
}
