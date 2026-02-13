package va;

import A9.O0;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.kt.apps.core.extensions.ExtensionsChannel;
import com.kt.apps.core.utils.StringUtilsKt;
import com.kt.apps.media.xemtv.beta.R;
import ea.C1108c;
import fb.AbstractC1148b;
import hb.C1268a;
import i.C1282b;
import i.C1285e;
import i.DialogInterfaceC1286f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import jb.InterfaceC1390a;
import kb.EnumC1437b;
import l1.AbstractC1449a;
import l2.AbstractC1456G;
import l2.H;
import m4.C1549C;
import m4.q0;
import ob.C1842j;
import v2.C2132d;
import y7.u0;
import y9.G;

/* loaded from: classes2.dex */
public final class C extends J {

    /* renamed from: v2, reason: collision with root package name */
    public static final /* synthetic */ int f25269v2 = 0;

    /* renamed from: n2, reason: collision with root package name */
    public ExtensionsChannel f25270n2;

    /* renamed from: t2, reason: collision with root package name */
    public nb.h f25276t2;

    /* renamed from: o2, reason: collision with root package name */
    public final Db.o f25271o2 = android.support.v4.media.session.b.z(new com.kt.apps.core.utils.l(24));

    /* renamed from: p2, reason: collision with root package name */
    public final Db.o f25272p2 = android.support.v4.media.session.b.z(new com.kt.apps.core.utils.l(25));

    /* renamed from: q2, reason: collision with root package name */
    public final O0 f25273q2 = vc.i.o(this, kotlin.jvm.internal.w.a(C2161e.class), new B(this, 0), new B(this, 1), new B(this, 2));

    /* renamed from: r2, reason: collision with root package name */
    public final O0 f25274r2 = vc.i.o(this, kotlin.jvm.internal.w.a(wa.h.class), new B(this, 3), new B(this, 4), new B(this, 5));

    /* renamed from: s2, reason: collision with root package name */
    public final Db.o f25275s2 = android.support.v4.media.session.b.z(new C2132d(this, 3));

    /* renamed from: u2, reason: collision with root package name */
    public final Db.o f25277u2 = android.support.v4.media.session.b.z(new com.kt.apps.core.utils.l(26));

    public static void p1(C c10, ExtensionsChannel extensionsChannel, String streamLink) {
        C2161e n12 = c10.n1();
        kotlin.jvm.internal.l.e(extensionsChannel, "extensionsChannel");
        kotlin.jvm.internal.l.e(streamLink, "streamLink");
        ((l2.H) n12.f25321i.getValue()).l(new Object());
        Ra.b bVar = n12.f25319f.f5334b;
        String itemId = extensionsChannel.getChannelId();
        kotlin.jvm.internal.l.e(itemId, "itemId");
        qb.r h10 = bVar.h(Eb.B.H(new Db.j("extra:item_id", itemId), new Db.j("extra:link_play", streamLink)));
        qb.b bVar2 = new qb.b(new I9.c(n12, 0), I9.b.f5314d);
        h10.b(bVar2);
        n12.add(bVar2);
        c10.X0(u0.x(new E9.i(streamLink, extensionsChannel.getReferer(), extensionsChannel.getChannelId(), extensionsChannel.isHls() || ac.g.b0(streamLink, "m3u8"))), extensionsChannel.getMapData(), extensionsChannel.getProps(), extensionsChannel.isHls() || ac.g.b0(streamLink, "m3u8"), c10.m1().f6852c == M9.c.f6847b, false);
    }

    @Override // y9.AbstractC2456A
    public final AbstractC1456G J0() {
        return n1().get_listProgramForChannel();
    }

    @Override // A9.C0085f2, W1.C
    public final void S(Bundle bundle) {
        super.S(bundle);
        this.f25270n2 = (ExtensionsChannel) h0().get("extra:tv_channel");
        this.f27445Q1 = (wa.h) this.f25274r2.getValue();
    }

    @Override // y9.AbstractC2456A
    public final W1.C S0() {
        return new Aa.d();
    }

    @Override // y9.AbstractC2456A
    public final void T0(boolean z8) {
        O0 o02 = this.f25274r2;
        if (!z8) {
            final ExtensionsChannel extensionsChannel = this.f25270n2;
            if (extensionsChannel != null) {
                final wa.h hVar = (wa.h) o02.getValue();
                nb.e eVar = hVar.f5332f;
                if (eVar != null) {
                    EnumC1437b.a(eVar);
                }
                C1842j a9 = hVar.f5327a.a(new W9.j(extensionsChannel.getChannelId(), extensionsChannel.getTvStreamLink(), extensionsChannel.getLogoChannel(), extensionsChannel.getTvGroup(), extensionsChannel.getLogoChannel(), extensionsChannel.getExtensionSourceId(), W9.i.f10892c));
                final int i7 = 1;
                nb.e eVar2 = new nb.e(0, new I9.h(hVar, 0), new InterfaceC1390a() { // from class: I9.g
                    @Override // jb.InterfaceC1390a
                    public final void run() {
                        switch (i7) {
                            case 0:
                                wa.h hVar2 = hVar;
                                H h10 = (H) hVar2.f5329c.getValue();
                                ExtensionsChannel extensionsChannel2 = extensionsChannel;
                                h10.l(new G(extensionsChannel2));
                                hVar2.e();
                                String.valueOf(extensionsChannel2);
                                return;
                            default:
                                wa.h hVar3 = hVar;
                                H h11 = (H) hVar3.f5331e.getValue();
                                ExtensionsChannel extensionsChannel3 = extensionsChannel;
                                h11.l(new G(extensionsChannel3));
                                hVar3.a();
                                hVar3.e();
                                String.valueOf(extensionsChannel3);
                                return;
                        }
                    }
                });
                a9.c(eVar2);
                hVar.f5332f = eVar2;
                hVar.add(eVar2);
                return;
            }
            return;
        }
        final ExtensionsChannel extensionsChannel2 = this.f25270n2;
        if (extensionsChannel2 != null) {
            final wa.h hVar2 = (wa.h) o02.getValue();
            nb.e eVar3 = hVar2.f5330d;
            if (eVar3 != null) {
                EnumC1437b.a(eVar3);
            }
            P9.b bVar = hVar2.f5327a;
            bVar.getClass();
            W9.j jVar = new W9.j(extensionsChannel2.getChannelId(), extensionsChannel2.getTvStreamLink(), extensionsChannel2.getTvChannelName(), extensionsChannel2.getTvGroup(), extensionsChannel2.getLogoChannel(), extensionsChannel2.getExtensionSourceId(), W9.i.f10892c);
            U9.w wVar = (U9.w) bVar.f8254b.getValue();
            wVar.getClass();
            C1842j e2 = android.support.v4.media.session.b.g(wVar.f9918a, new U9.v(wVar, jVar, 0)).e(Ab.e.f1561c);
            final int i10 = 0;
            nb.e eVar4 = new nb.e(0, new I9.h(hVar2, 1), new InterfaceC1390a() { // from class: I9.g
                @Override // jb.InterfaceC1390a
                public final void run() {
                    switch (i10) {
                        case 0:
                            wa.h hVar22 = hVar2;
                            H h10 = (H) hVar22.f5329c.getValue();
                            ExtensionsChannel extensionsChannel22 = extensionsChannel2;
                            h10.l(new G(extensionsChannel22));
                            hVar22.e();
                            String.valueOf(extensionsChannel22);
                            return;
                        default:
                            wa.h hVar3 = hVar2;
                            H h11 = (H) hVar3.f5331e.getValue();
                            ExtensionsChannel extensionsChannel3 = extensionsChannel2;
                            h11.l(new G(extensionsChannel3));
                            hVar3.a();
                            hVar3.e();
                            String.valueOf(extensionsChannel3);
                            return;
                    }
                }
            });
            e2.c(eVar4);
            hVar2.f5330d = eVar4;
            hVar2.add(eVar4);
        }
    }

    @Override // y9.AbstractC2456A
    public final void U0(q0 error) {
        kotlin.jvm.internal.l.e(error, "error");
    }

    @Override // y9.AbstractC2456A, A9.C0085f2, W1.C
    public final void V() {
        ((C1268a) this.f25277u2.getValue()).e();
        super.V();
    }

    @Override // y9.AbstractC2456A
    public final void V0(int i7) {
        ExtensionsChannel extensionsChannel;
        if (i7 != 3 || (extensionsChannel = this.f25270n2) == null) {
            return;
        }
        O9.a aVar = this.f27458d1;
        if (aVar != null) {
            c2.q.t(aVar, extensionsChannel.getTvChannelName(), new Db.j("channelLink", extensionsChannel.getTvStreamLink()));
        } else {
            kotlin.jvm.internal.l.j("actionLogger");
            throw null;
        }
    }

    @Override // y9.AbstractC2456A, A9.C0085f2, W1.C
    public final void Y() {
        ((l2.H) n1().f25321i.getValue()).l(new Object());
        super.Y();
    }

    @Override // y9.AbstractC2456A, A9.C0085f2, W1.C
    public final void d0(View view, Bundle bundle) {
        kotlin.jvm.internal.l.e(view, "view");
        super.d0(view, bundle);
        ExtensionsChannel extensionsChannel = this.f25270n2;
        if (extensionsChannel != null) {
            String.valueOf(extensionsChannel);
            o1(extensionsChannel, false, true);
        }
        String message = "id = " + m1();
        kotlin.jvm.internal.l.e(message, "message");
        final int i7 = 0;
        n1().d(m1().f6851b).e(H(), new Aa.b(new Rb.c(this) { // from class: va.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C f25365b;

            {
                this.f25365b = this;
            }

            /* JADX WARN: Type inference failed for: r1v7, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
            @Override // Rb.c
            public final Object invoke(Object obj) {
                Db.q qVar = Db.q.f3365a;
                final C c10 = this.f25365b;
                y9.I i10 = (y9.I) obj;
                switch (i7) {
                    case 0:
                        int i11 = C.f25269v2;
                        if (i10 instanceof y9.G) {
                            c10.q1((List) ((y9.G) i10).f27483a);
                            c10.f27442M1 = new n4.b(11, c10, i10);
                        }
                        return qVar;
                    case 1:
                        int i12 = C.f25269v2;
                        if (i10 instanceof y9.G) {
                            ExtensionsChannel extensionsChannel2 = c10.f25270n2;
                            y9.G g = (y9.G) i10;
                            if (kotlin.jvm.internal.l.a(extensionsChannel2 != null ? extensionsChannel2.getChannelId() : null, ((N9.a) g.f27483a).f7389a)) {
                                ExtensionsChannel extensionsChannel3 = c10.f25270n2;
                                if (extensionsChannel3 != null) {
                                    extensionsChannel3.setCurrentProgramme((N9.a) g.f27483a);
                                }
                                ExtensionsChannel extensionsChannel4 = c10.f25270n2;
                                if (extensionsChannel4 != null) {
                                    c10.r1(extensionsChannel4, false);
                                }
                            }
                        }
                        return qVar;
                    default:
                        int i13 = C.f25269v2;
                        if (i10 instanceof y9.G) {
                            y9.G g2 = (y9.G) i10;
                            final W9.c cVar = (W9.c) g2.f27483a;
                            String B10 = n5.D.B(c10.f27449U1, c10.f27450V1, cVar.f10862e);
                            kotlin.jvm.internal.l.d(B10, "getStringForTime(...)");
                            W9.c cVar2 = (W9.c) g2.f27483a;
                            SpannableString spannableString = new SpannableString(h3.o.n("Bạn đang xem ", cVar2.f10860c, " tại ", B10, ".\nBạn có muốn tiếp tục không?"));
                            int f02 = ac.g.f0(spannableString, B10, 0, 6);
                            String str = cVar2.f10860c;
                            int f03 = ac.g.f0(spannableString, str, 0, 6);
                            spannableString.setSpan(new ForegroundColorSpan(AbstractC1449a.getColor(c10.i0(), R.color.color_text_highlight)), f02, B10.length() + f02, 34);
                            spannableString.setSpan(new ForegroundColorSpan(AbstractC1449a.getColor(c10.i0(), R.color.color_text_highlight)), f03, str.length() + f03, 34);
                            ExtensionsChannel extensionsChannel5 = c10.f25270n2;
                            if (kotlin.jvm.internal.l.a(extensionsChannel5 != null ? extensionsChannel5.getChannelId() : null, cVar.f10858a)) {
                                C1285e title = new C1285e(new ContextThemeWrapper(c10.g0(), R.style.Theme_AppCompat), R.style.AlertDialogTheme).setTitle(cVar2.f10859b);
                                C1282b c1282b = title.f18068a;
                                c1282b.f18031f = spannableString;
                                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: va.y
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i14) {
                                        int i15 = C.f25269v2;
                                        C c11 = C.this;
                                        c11.e1(true);
                                        C1549C c1549c = c11.H0().f3807c;
                                        if (c1549c != null) {
                                            c1549c.z(5, cVar.f10862e);
                                        }
                                        dialogInterface.dismiss();
                                    }
                                };
                                c1282b.g = "Có";
                                c1282b.f18032h = onClickListener;
                                ?? obj2 = new Object();
                                c1282b.f18033i = "Xem lại từ đầu";
                                c1282b.j = obj2;
                                final DialogInterfaceC1286f create = title.create();
                                create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: va.w
                                    @Override // android.content.DialogInterface.OnShowListener
                                    public final void onShow(DialogInterface dialogInterface) {
                                        int i14 = C.f25269v2;
                                        View findViewById = DialogInterfaceC1286f.this.findViewById(android.R.id.button1);
                                        if (findViewById != null) {
                                            findViewById.requestFocus();
                                        }
                                    }
                                });
                                create.show();
                            }
                        }
                        return qVar;
                }
            }
        }, 8));
        final int i10 = 1;
        n1().get_programmeForChannelLiveData().e(H(), new Aa.b(new Rb.c(this) { // from class: va.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C f25365b;

            {
                this.f25365b = this;
            }

            /* JADX WARN: Type inference failed for: r1v7, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
            @Override // Rb.c
            public final Object invoke(Object obj) {
                Db.q qVar = Db.q.f3365a;
                final C c10 = this.f25365b;
                y9.I i102 = (y9.I) obj;
                switch (i10) {
                    case 0:
                        int i11 = C.f25269v2;
                        if (i102 instanceof y9.G) {
                            c10.q1((List) ((y9.G) i102).f27483a);
                            c10.f27442M1 = new n4.b(11, c10, i102);
                        }
                        return qVar;
                    case 1:
                        int i12 = C.f25269v2;
                        if (i102 instanceof y9.G) {
                            ExtensionsChannel extensionsChannel2 = c10.f25270n2;
                            y9.G g = (y9.G) i102;
                            if (kotlin.jvm.internal.l.a(extensionsChannel2 != null ? extensionsChannel2.getChannelId() : null, ((N9.a) g.f27483a).f7389a)) {
                                ExtensionsChannel extensionsChannel3 = c10.f25270n2;
                                if (extensionsChannel3 != null) {
                                    extensionsChannel3.setCurrentProgramme((N9.a) g.f27483a);
                                }
                                ExtensionsChannel extensionsChannel4 = c10.f25270n2;
                                if (extensionsChannel4 != null) {
                                    c10.r1(extensionsChannel4, false);
                                }
                            }
                        }
                        return qVar;
                    default:
                        int i13 = C.f25269v2;
                        if (i102 instanceof y9.G) {
                            y9.G g2 = (y9.G) i102;
                            final W9.c cVar = (W9.c) g2.f27483a;
                            String B10 = n5.D.B(c10.f27449U1, c10.f27450V1, cVar.f10862e);
                            kotlin.jvm.internal.l.d(B10, "getStringForTime(...)");
                            W9.c cVar2 = (W9.c) g2.f27483a;
                            SpannableString spannableString = new SpannableString(h3.o.n("Bạn đang xem ", cVar2.f10860c, " tại ", B10, ".\nBạn có muốn tiếp tục không?"));
                            int f02 = ac.g.f0(spannableString, B10, 0, 6);
                            String str = cVar2.f10860c;
                            int f03 = ac.g.f0(spannableString, str, 0, 6);
                            spannableString.setSpan(new ForegroundColorSpan(AbstractC1449a.getColor(c10.i0(), R.color.color_text_highlight)), f02, B10.length() + f02, 34);
                            spannableString.setSpan(new ForegroundColorSpan(AbstractC1449a.getColor(c10.i0(), R.color.color_text_highlight)), f03, str.length() + f03, 34);
                            ExtensionsChannel extensionsChannel5 = c10.f25270n2;
                            if (kotlin.jvm.internal.l.a(extensionsChannel5 != null ? extensionsChannel5.getChannelId() : null, cVar.f10858a)) {
                                C1285e title = new C1285e(new ContextThemeWrapper(c10.g0(), R.style.Theme_AppCompat), R.style.AlertDialogTheme).setTitle(cVar2.f10859b);
                                C1282b c1282b = title.f18068a;
                                c1282b.f18031f = spannableString;
                                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: va.y
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i14) {
                                        int i15 = C.f25269v2;
                                        C c11 = C.this;
                                        c11.e1(true);
                                        C1549C c1549c = c11.H0().f3807c;
                                        if (c1549c != null) {
                                            c1549c.z(5, cVar.f10862e);
                                        }
                                        dialogInterface.dismiss();
                                    }
                                };
                                c1282b.g = "Có";
                                c1282b.f18032h = onClickListener;
                                ?? obj2 = new Object();
                                c1282b.f18033i = "Xem lại từ đầu";
                                c1282b.j = obj2;
                                final DialogInterfaceC1286f create = title.create();
                                create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: va.w
                                    @Override // android.content.DialogInterface.OnShowListener
                                    public final void onShow(DialogInterface dialogInterface) {
                                        int i14 = C.f25269v2;
                                        View findViewById = DialogInterfaceC1286f.this.findViewById(android.R.id.button1);
                                        if (findViewById != null) {
                                            findViewById.requestFocus();
                                        }
                                    }
                                });
                                create.show();
                            }
                        }
                        return qVar;
                }
            }
        }, 8));
        final int i11 = 2;
        ((l2.H) n1().f25321i.getValue()).e(H(), new Aa.b(new Rb.c(this) { // from class: va.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C f25365b;

            {
                this.f25365b = this;
            }

            /* JADX WARN: Type inference failed for: r1v7, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
            @Override // Rb.c
            public final Object invoke(Object obj) {
                Db.q qVar = Db.q.f3365a;
                final C c10 = this.f25365b;
                y9.I i102 = (y9.I) obj;
                switch (i11) {
                    case 0:
                        int i112 = C.f25269v2;
                        if (i102 instanceof y9.G) {
                            c10.q1((List) ((y9.G) i102).f27483a);
                            c10.f27442M1 = new n4.b(11, c10, i102);
                        }
                        return qVar;
                    case 1:
                        int i12 = C.f25269v2;
                        if (i102 instanceof y9.G) {
                            ExtensionsChannel extensionsChannel2 = c10.f25270n2;
                            y9.G g = (y9.G) i102;
                            if (kotlin.jvm.internal.l.a(extensionsChannel2 != null ? extensionsChannel2.getChannelId() : null, ((N9.a) g.f27483a).f7389a)) {
                                ExtensionsChannel extensionsChannel3 = c10.f25270n2;
                                if (extensionsChannel3 != null) {
                                    extensionsChannel3.setCurrentProgramme((N9.a) g.f27483a);
                                }
                                ExtensionsChannel extensionsChannel4 = c10.f25270n2;
                                if (extensionsChannel4 != null) {
                                    c10.r1(extensionsChannel4, false);
                                }
                            }
                        }
                        return qVar;
                    default:
                        int i13 = C.f25269v2;
                        if (i102 instanceof y9.G) {
                            y9.G g2 = (y9.G) i102;
                            final W9.c cVar = (W9.c) g2.f27483a;
                            String B10 = n5.D.B(c10.f27449U1, c10.f27450V1, cVar.f10862e);
                            kotlin.jvm.internal.l.d(B10, "getStringForTime(...)");
                            W9.c cVar2 = (W9.c) g2.f27483a;
                            SpannableString spannableString = new SpannableString(h3.o.n("Bạn đang xem ", cVar2.f10860c, " tại ", B10, ".\nBạn có muốn tiếp tục không?"));
                            int f02 = ac.g.f0(spannableString, B10, 0, 6);
                            String str = cVar2.f10860c;
                            int f03 = ac.g.f0(spannableString, str, 0, 6);
                            spannableString.setSpan(new ForegroundColorSpan(AbstractC1449a.getColor(c10.i0(), R.color.color_text_highlight)), f02, B10.length() + f02, 34);
                            spannableString.setSpan(new ForegroundColorSpan(AbstractC1449a.getColor(c10.i0(), R.color.color_text_highlight)), f03, str.length() + f03, 34);
                            ExtensionsChannel extensionsChannel5 = c10.f25270n2;
                            if (kotlin.jvm.internal.l.a(extensionsChannel5 != null ? extensionsChannel5.getChannelId() : null, cVar.f10858a)) {
                                C1285e title = new C1285e(new ContextThemeWrapper(c10.g0(), R.style.Theme_AppCompat), R.style.AlertDialogTheme).setTitle(cVar2.f10859b);
                                C1282b c1282b = title.f18068a;
                                c1282b.f18031f = spannableString;
                                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: va.y
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i14) {
                                        int i15 = C.f25269v2;
                                        C c11 = C.this;
                                        c11.e1(true);
                                        C1549C c1549c = c11.H0().f3807c;
                                        if (c1549c != null) {
                                            c1549c.z(5, cVar.f10862e);
                                        }
                                        dialogInterface.dismiss();
                                    }
                                };
                                c1282b.g = "Có";
                                c1282b.f18032h = onClickListener;
                                ?? obj2 = new Object();
                                c1282b.f18033i = "Xem lại từ đầu";
                                c1282b.j = obj2;
                                final DialogInterfaceC1286f create = title.create();
                                create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: va.w
                                    @Override // android.content.DialogInterface.OnShowListener
                                    public final void onShow(DialogInterface dialogInterface) {
                                        int i14 = C.f25269v2;
                                        View findViewById = DialogInterfaceC1286f.this.findViewById(android.R.id.button1);
                                        if (findViewById != null) {
                                            findViewById.requestFocus();
                                        }
                                    }
                                });
                                create.show();
                            }
                        }
                        return qVar;
                }
            }
        }, 8));
    }

    public final M9.d m1() {
        return (M9.d) this.f25275s2.getValue();
    }

    public final C2161e n1() {
        return (C2161e) this.f25273q2.getValue();
    }

    public final void o1(final ExtensionsChannel channel, boolean z8, boolean z10) {
        if (!M0().g) {
            M0().b();
        }
        Y5.A a9 = lb.b.f19614c;
        if (z10) {
            C2161e n12 = n1();
            M9.c extensionsType = m1().f6852c;
            kotlin.jvm.internal.l.e(channel, "channel");
            kotlin.jvm.internal.l.e(extensionsType, "extensionsType");
            nb.h hVar = n12.f25323m;
            if (hVar != null) {
                EnumC1437b.a(hVar);
            }
            fa.b bVar = n12.f25316c;
            bVar.getClass();
            gb.i execute = bVar.execute(Eb.B.G(new Db.j("extra:channel", channel)));
            I9.e eVar = new I9.e(n12, 0);
            I9.f fVar = new I9.f(n12);
            execute.getClass();
            nb.h hVar2 = new nb.h(eVar, fVar, a9);
            execute.b(hVar2);
            n12.f25323m = hVar2;
            n12.add(hVar2);
        }
        nb.h hVar3 = this.f25276t2;
        Db.o oVar = this.f25277u2;
        if (hVar3 != null) {
            ((C1268a) oVar.getValue()).c(hVar3);
        }
        ((C1268a) oVar.getValue()).e();
        final String tvStreamLink = !z8 ? channel.getTvStreamLink() : channel.getCatchupSource();
        String message = channel + ",\tuseCatchup: " + z8 + ",isHls: " + (ac.g.b0(tvStreamLink, "m3u8") || StringUtilsKt.isShortLink(tvStreamLink));
        kotlin.jvm.internal.l.e(message, "message");
        if (z10) {
            r1(channel, true);
        }
        if (StringUtilsKt.isShortLink(tvStreamLink)) {
            final int i7 = 0;
            sb.w n6 = new sb.s(new Callable() { // from class: va.x
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String str = tvStreamLink;
                    ExtensionsChannel extensionsChannel = channel;
                    switch (i7) {
                        case 0:
                            int i10 = C.f25269v2;
                            return StringUtilsKt.expandUrl(str, extensionsChannel.getProps());
                        default:
                            int i11 = C.f25269v2;
                            return StringUtilsKt.expandUrl(str, extensionsChannel.getProps());
                    }
                }
            }).q(Ab.e.f1561c).n(AbstractC1148b.a());
            nb.h hVar4 = new nb.h(new C1108c(17, this, channel), new A(this, channel, tvStreamLink, 0), a9);
            n6.b(hVar4);
            this.f25276t2 = hVar4;
            C1268a c1268a = (C1268a) oVar.getValue();
            nb.h hVar5 = this.f25276t2;
            kotlin.jvm.internal.l.b(hVar5);
            c1268a.d(hVar5);
            return;
        }
        if (ac.g.b0(tvStreamLink, ".m3u8") || ac.n.Y(tvStreamLink, "rtp", false) || ac.n.Y(tvStreamLink, "udp", false)) {
            p1(this, channel, tvStreamLink);
            return;
        }
        C1268a c1268a2 = (C1268a) oVar.getValue();
        final int i10 = 1;
        sb.w n8 = new sb.s(new Callable() { // from class: va.x
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str = tvStreamLink;
                ExtensionsChannel extensionsChannel = channel;
                switch (i10) {
                    case 0:
                        int i102 = C.f25269v2;
                        return StringUtilsKt.expandUrl(str, extensionsChannel.getProps());
                    default:
                        int i11 = C.f25269v2;
                        return StringUtilsKt.expandUrl(str, extensionsChannel.getProps());
                }
            }
        }).q(Ab.e.f1561c).n(AbstractC1148b.a());
        nb.h hVar6 = new nb.h(new ha.g(14, this, channel), new A(this, channel, tvStreamLink, 1), a9);
        n8.b(hVar6);
        c1268a2.d(hVar6);
    }

    public final void q1(List list) {
        Db.o oVar = this.f25271o2;
        ((List) oVar.getValue()).clear();
        ExtensionsChannel extensionsChannel = this.f25270n2;
        if (extensionsChannel != null) {
            List list2 = (List) oVar.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (kotlin.jvm.internal.l.a(((ExtensionsChannel) obj).getTvGroup(), extensionsChannel.getTvGroup())) {
                    arrayList.add(obj);
                }
            }
            list2.addAll(arrayList);
            List list3 = (List) oVar.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (!kotlin.jvm.internal.l.a(((ExtensionsChannel) obj2).getTvGroup(), extensionsChannel.getTvGroup())) {
                    arrayList2.add(obj2);
                }
            }
            list3.addAll(arrayList2);
        } else {
            ((List) oVar.getValue()).addAll(list);
        }
        d1((List) oVar.getValue(), new sa.h(g0()), new List[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r0 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r1 != null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r1(ExtensionsChannel extensionsChannel, boolean z8) {
        String tvChannelName;
        String tvGroup;
        String str;
        String str2;
        String.valueOf(extensionsChannel);
        N9.a currentProgramme = extensionsChannel.getCurrentProgramme();
        if (currentProgramme != null && (str2 = currentProgramme.f7393e) != null) {
            if (ac.g.h0(ac.g.v0(str2).toString())) {
                str2 = null;
            }
            if (str2 != null) {
                tvChannelName = ac.g.v0(str2).toString();
            }
        }
        tvChannelName = extensionsChannel.getTvChannelName();
        N9.a currentProgramme2 = extensionsChannel.getCurrentProgramme();
        if (currentProgramme2 != null && (str = currentProgramme2.f7394f) != null) {
            String str3 = ac.g.h0(str) ? null : str;
            if (str3 != null) {
                tvGroup = ac.g.v0(str3).toString();
            }
        }
        tvGroup = extensionsChannel.getTvGroup();
        Y0(tvChannelName, tvGroup, false, z8);
    }

    @Override // A9.C0085f2
    public final void s0(int i7, String str) {
        String message = "errorCode: " + i7 + ", errorMessage: " + ((Object) str);
        kotlin.jvm.internal.l.e(message, "message");
        Db.o oVar = this.f25272p2;
        Map map = (Map) oVar.getValue();
        ExtensionsChannel extensionsChannel = this.f25270n2;
        kotlin.jvm.internal.l.b(extensionsChannel);
        Integer num = (Integer) map.get(extensionsChannel.getChannelId());
        int intValue = num != null ? num.intValue() : 0;
        ExtensionsChannel extensionsChannel2 = this.f25270n2;
        if (extensionsChannel2 != null) {
            String catchupSource = extensionsChannel2.getCatchupSource();
            boolean z8 = catchupSource == null || ac.g.h0(catchupSource) || intValue < 2;
            if (intValue > 3) {
                f1(i7, null, new wa.f(15));
                Map map2 = (Map) oVar.getValue();
                ExtensionsChannel extensionsChannel3 = this.f25270n2;
                kotlin.jvm.internal.l.b(extensionsChannel3);
                map2.put(extensionsChannel3.getChannelId(), 0);
                return;
            }
            if (z8) {
                ExtensionsChannel extensionsChannel4 = this.f25270n2;
                if (extensionsChannel4 != null) {
                    o1(extensionsChannel4, false, false);
                }
                Map map3 = (Map) oVar.getValue();
                ExtensionsChannel extensionsChannel5 = this.f25270n2;
                kotlin.jvm.internal.l.b(extensionsChannel5);
                map3.put(extensionsChannel5.getChannelId(), Integer.valueOf(intValue + 1));
                return;
            }
            ExtensionsChannel extensionsChannel6 = this.f25270n2;
            String catchupSource2 = extensionsChannel6 != null ? extensionsChannel6.getCatchupSource() : null;
            if (catchupSource2 == null || ac.g.h0(catchupSource2)) {
                return;
            }
            ExtensionsChannel extensionsChannel7 = this.f25270n2;
            if (extensionsChannel7 != null) {
                o1(extensionsChannel7, true, false);
            }
            Map map4 = (Map) oVar.getValue();
            ExtensionsChannel extensionsChannel8 = this.f25270n2;
            kotlin.jvm.internal.l.b(extensionsChannel8);
            map4.put(extensionsChannel8.getChannelId(), Integer.valueOf(intValue + 1));
        }
    }
}
