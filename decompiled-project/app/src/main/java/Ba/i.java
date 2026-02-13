package Ba;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.service.CloudMessagingService;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.update.downloadmanager.ApkDownloader;
import com.kt.apps.core.utils.StringUtilsKt;
import com.kt.apps.core.utils.blurry.BlurFactor;
import com.kt.apps.media.xemtv.ui.search.TVSearchActivity;
import f.C1123g;
import java.io.File;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l2.Q;
import v2.C2133e;
import v2.C2138j;
import w.AbstractC2173C;
import w.C2187n;
import w2.C2204a;
import x.AbstractC2232b;
import y7.u0;
import y9.G;
import y9.I;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2258a;

    public /* synthetic */ i(int i7) {
        this.f2258a = i7;
    }

    @Override // Rb.c
    public final Object invoke(Object it) {
        int parseInt;
        int i7 = 700;
        Db.q qVar = Db.q.f3365a;
        switch (this.f2258a) {
            case 0:
                int i10 = TVSearchActivity.f16217a0;
                return qVar;
            case 1:
                T2.a _connection = (T2.a) it;
                kotlin.jvm.internal.l.e(_connection, "_connection");
                T2.c R10 = _connection.R("SELECT * FROM ads_version WHERE id = 1 LIMIT 1");
                try {
                    return R10.J() ? new Ic.a((int) R10.x(P2.j.h(R10, "id")), R10.x(P2.j.h(R10, "version")), R10.x(P2.j.h(R10, "lastUpdated"))) : null;
                } finally {
                }
            case 2:
                T2.a _connection2 = (T2.a) it;
                kotlin.jvm.internal.l.e(_connection2, "_connection");
                try {
                    _connection2.R("DELETE FROM banner_ads").J();
                    return qVar;
                } finally {
                }
            case 3:
                T2.c it2 = (T2.c) it;
                kotlin.jvm.internal.l.e(it2, "it");
                return Boolean.valueOf(it2.J());
            case 4:
                T2.c statement = (T2.c) it;
                kotlin.jvm.internal.l.e(statement, "statement");
                Fb.i iVar = new Fb.i();
                while (statement.J()) {
                    iVar.add(Integer.valueOf((int) statement.x(0)));
                }
                return O5.b.i(iVar);
            case 5:
                int i11 = CloudMessagingService.f16116C;
                return qVar;
            case 6:
                TVChannel it3 = (TVChannel) it;
                kotlin.jvm.internal.l.e(it3, "it");
                String group = it3.getTvGroup();
                kotlin.jvm.internal.l.e(group, "group");
                Locale locale = Locale.ROOT;
                String lowerCase = group.toLowerCase(locale);
                kotlin.jvm.internal.l.d(lowerCase, "toLowerCase(...)");
                String lowerCase2 = "VTV".toLowerCase(locale);
                kotlin.jvm.internal.l.d(lowerCase2, "toLowerCase(...)");
                if (lowerCase.equals(lowerCase2)) {
                    i7 = 100;
                } else {
                    String lowerCase3 = "VTC".toLowerCase(locale);
                    kotlin.jvm.internal.l.d(lowerCase3, "toLowerCase(...)");
                    if (lowerCase.equals(lowerCase3)) {
                        i7 = 200;
                    } else {
                        String lowerCase4 = "HTV".toLowerCase(locale);
                        kotlin.jvm.internal.l.d(lowerCase4, "toLowerCase(...)");
                        if (lowerCase.equals(lowerCase4)) {
                            i7 = 300;
                        } else {
                            String lowerCase5 = "HTVC".toLowerCase(locale);
                            kotlin.jvm.internal.l.d(lowerCase5, "toLowerCase(...)");
                            if (lowerCase.equals(lowerCase5)) {
                                i7 = 400;
                            } else {
                                String lowerCase6 = "SCTV".toLowerCase(locale);
                                kotlin.jvm.internal.l.d(lowerCase6, "toLowerCase(...)");
                                if (lowerCase.equals(lowerCase6)) {
                                    i7 = 500;
                                } else {
                                    String lowerCase7 = "THVL".toLowerCase(locale);
                                    kotlin.jvm.internal.l.d(lowerCase7, "toLowerCase(...)");
                                    if (lowerCase.equals(lowerCase7)) {
                                        i7 = 600;
                                    } else {
                                        String lowerCase8 = "Intenational".toLowerCase(locale);
                                        kotlin.jvm.internal.l.d(lowerCase8, "toLowerCase(...)");
                                        if (!lowerCase.equals(lowerCase8)) {
                                            String lowerCase9 = "Kid".toLowerCase(locale);
                                            kotlin.jvm.internal.l.d(lowerCase9, "toLowerCase(...)");
                                            i7 = lowerCase.equals(lowerCase9) ? 800 : 1000;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i7 < 1000) {
                    Matcher matcher = Pattern.compile("[0-9]+").matcher(it3.getTvChannelName());
                    while (true) {
                        while (matcher.find()) {
                            String group2 = matcher.group(0);
                            parseInt = group2 != null ? Integer.parseInt(group2) : 99;
                        }
                        i7 += parseInt;
                    }
                }
                return Integer.valueOf(i7);
            case 7:
                kotlin.jvm.internal.l.e(it, "it");
                return C1123g.f16913a.invoke();
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return Boolean.valueOf(it == null);
            case 9:
                return Boolean.valueOf(ApkDownloader.c((File) it));
            case 10:
                return StringUtilsKt.a(((Byte) it).byteValue());
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                kotlin.jvm.internal.l.e((Bitmap) it, "it");
                return qVar;
            case 12:
                kotlin.jvm.internal.l.e((Bitmap) it, "it");
                return qVar;
            case 13:
                Context it4 = (Context) it;
                kotlin.jvm.internal.l.e(it4, "it");
                if (it4 instanceof ContextWrapper) {
                    return ((ContextWrapper) it4).getBaseContext();
                }
                return null;
            case 14:
                Context it5 = (Context) it;
                kotlin.jvm.internal.l.e(it5, "it");
                if (it5 instanceof ContextWrapper) {
                    return ((ContextWrapper) it5).getBaseContext();
                }
                return null;
            case 15:
                kotlin.jvm.internal.l.e((o2.c) it, "$this$initializer");
                return new C2138j();
            case 16:
                v2.q it6 = (v2.q) it;
                kotlin.jvm.internal.l.e(it6, "it");
                return it6.f25018c;
            case 17:
                v2.q it7 = (v2.q) it;
                kotlin.jvm.internal.l.e(it7, "it");
                if (!(it7 instanceof v2.r)) {
                    return null;
                }
                B4.j jVar = ((v2.r) it7).f25021f;
                return jVar.h(jVar.f2089b);
            case 18:
                return new C2204a(Q.b((o2.c) it));
            case 19:
                return AbstractC2173C.a(AbstractC2232b.k(700, null, 6), 2);
            case 20:
                v2.q qVar2 = ((C2133e) ((C2187n) it).c()).f24967b;
                kotlin.jvm.internal.l.c(qVar2, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                int i12 = v2.q.f25015e;
                for (v2.q qVar3 : u0.r((w2.h) qVar2)) {
                    if (qVar3 instanceof w2.h) {
                        ((w2.h) qVar3).getClass();
                    } else if (qVar3 instanceof w2.f) {
                        ((w2.f) qVar3).getClass();
                    }
                }
                return null;
            case 21:
                return AbstractC2173C.b(AbstractC2232b.k(700, null, 6), 2);
            case 22:
                return ((C2133e) it).f24971f;
            case 23:
                o2.c initializer = (o2.c) it;
                kotlin.jvm.internal.l.e(initializer, "$this$initializer");
                return new y2.b(Q.b(initializer));
            case 24:
                v2.q destination = (v2.q) it;
                kotlin.jvm.internal.l.e(destination, "destination");
                v2.r rVar = destination.f25018c;
                if (rVar == null || rVar.f25021f.f2089b != destination.f25017b.f4638a) {
                    return null;
                }
                return rVar;
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                v2.q destination2 = (v2.q) it;
                kotlin.jvm.internal.l.e(destination2, "destination");
                v2.r rVar2 = destination2.f25018c;
                if (rVar2 == null || rVar2.f25021f.f2089b != destination2.f25017b.f4638a) {
                    return null;
                }
                return rVar2;
            case 26:
                v2.q it8 = (v2.q) it;
                kotlin.jvm.internal.l.e(it8, "it");
                return Integer.valueOf(it8.f25017b.f4638a);
            default:
                I i13 = (I) it;
                if (i13 instanceof G) {
                }
                return qVar;
        }
    }
}
