package Hc;

import G8.m;
import I2.AbstractC0315d;
import U9.h;
import U9.p;
import U9.w;
import W9.f;
import W9.i;
import W9.j;
import android.net.Uri;
import com.kt.apps.core.extensions.ExtensionsChannel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;
import t8.C2034c;

/* loaded from: classes2.dex */
public final class c extends AbstractC0315d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4926b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f4925a = i7;
        this.f4926b = obj;
    }

    @Override // I2.AbstractC0315d
    public final void b(T2.c statement, Object obj) {
        String f4;
        String str;
        String str2;
        String str3;
        switch (this.f4925a) {
            case 0:
                Ic.b entity = (Ic.b) obj;
                l.e(statement, "statement");
                l.e(entity, "entity");
                statement.y(1, entity.f5358a);
                statement.y(2, entity.f5359b);
                statement.y(3, entity.f5360c);
                statement.y(4, entity.f5361d);
                Double d10 = entity.f5362e;
                if (d10 == null) {
                    statement.a(5);
                } else {
                    statement.b(5, d10.doubleValue());
                }
                statement.y(6, entity.f5363f);
                statement.y(7, entity.g);
                statement.y(8, entity.f5364h);
                statement.y(9, entity.f5365i);
                if (entity.j == null) {
                    statement.a(10);
                } else {
                    statement.f(10, r1.intValue());
                }
                Double d11 = entity.k;
                if (d11 == null) {
                    statement.a(11);
                } else {
                    statement.b(11, d11.doubleValue());
                }
                String str4 = entity.f5366l;
                if (str4 == null) {
                    statement.a(12);
                } else {
                    statement.y(12, str4);
                }
                String str5 = entity.f5367m;
                if (str5 == null) {
                    statement.a(13);
                } else {
                    statement.y(13, str5);
                }
                statement.y(14, entity.f5368n);
                C2034c c2034c = ((d) this.f4926b).f4929c;
                List list = entity.f5369o;
                if (list == null) {
                    c2034c.getClass();
                    f4 = null;
                } else {
                    f4 = ((m) c2034c.f24513b).f(list);
                }
                if (f4 == null) {
                    statement.a(15);
                } else {
                    statement.y(15, f4);
                }
                String str6 = entity.f5370p;
                if (str6 == null) {
                    statement.a(16);
                } else {
                    statement.y(16, str6);
                }
                String str7 = entity.f5371q;
                if (str7 == null) {
                    statement.a(17);
                    return;
                } else {
                    statement.y(17, str7);
                    return;
                }
            case 1:
                ExtensionsChannel entity2 = (ExtensionsChannel) obj;
                l.e(statement, "statement");
                l.e(entity2, "entity");
                statement.y(1, entity2.getTvGroup());
                statement.y(2, entity2.getLogoChannel());
                statement.y(3, entity2.getTvChannelName());
                statement.y(4, entity2.getTvStreamLink());
                statement.y(5, entity2.getSourceFrom());
                statement.y(6, entity2.getChannelId());
                statement.f(7, entity2.getChannelPreviewProviderId());
                statement.f(8, entity2.isHls() ? 1L : 0L);
                statement.y(9, entity2.getCatchupSource());
                statement.y(10, entity2.getUserAgent());
                statement.y(11, entity2.getReferer());
                Map<String, String> props = entity2.getProps();
                ((U9.d) this.f4926b).f9856c.getClass();
                String str8 = "";
                if (props != null && !props.isEmpty()) {
                    try {
                        String g = new m().g(T9.a.f9383a, props);
                        l.b(g);
                        str8 = g;
                    } catch (Exception unused) {
                    }
                }
                statement.y(12, str8);
                statement.y(13, entity2.getExtensionSourceId());
                return;
            case 2:
                M9.d entity3 = (M9.d) obj;
                l.e(statement, "statement");
                l.e(entity3, "entity");
                statement.y(1, entity3.f6850a);
                statement.y(2, entity3.f6851b);
                T9.a aVar = ((h) this.f4926b).f9864c;
                M9.c type = entity3.f6852c;
                aVar.getClass();
                l.e(type, "type");
                try {
                    str = type.name();
                } catch (Exception unused2) {
                    str = "TV_CHANNEL";
                }
                statement.y(3, str);
                return;
            case 3:
                W9.c entity4 = (W9.c) obj;
                l.e(statement, "statement");
                l.e(entity4, "entity");
                statement.y(1, entity4.f10858a);
                statement.y(2, entity4.f10859b);
                statement.y(3, entity4.f10860c);
                statement.y(4, entity4.f10861d);
                statement.f(5, entity4.f10862e);
                statement.f(6, entity4.f10863f);
                statement.f(7, entity4.g ? 1L : 0L);
                statement.y(8, entity4.f10864h);
                statement.y(9, entity4.f10865i);
                ((U9.l) this.f4926b).f9901c.getClass();
                W9.b type2 = entity4.j;
                l.e(type2, "type");
                try {
                    str2 = type2.name();
                } catch (Exception unused3) {
                    str2 = "IPTV";
                }
                statement.y(10, str2);
                statement.f(11, entity4.k);
                return;
            case 4:
                f entity5 = (f) obj;
                l.e(statement, "statement");
                l.e(entity5, "entity");
                statement.y(1, entity5.f10880a);
                ((p) this.f4926b).f9908c.getClass();
                Uri uri = entity5.f10881b;
                l.e(uri, "uri");
                String uri2 = uri.toString();
                l.d(uri2, "toString(...)");
                statement.y(2, uri2);
                statement.y(3, entity5.f10882c);
                statement.y(4, entity5.f10883d);
                statement.y(5, entity5.f10884e);
                statement.y(6, entity5.f10885f);
                statement.f(7, entity5.g);
                return;
            default:
                j entity6 = (j) obj;
                l.e(statement, "statement");
                l.e(entity6, "entity");
                statement.y(1, entity6.f10894a);
                statement.y(2, entity6.f10895b);
                statement.y(3, entity6.f10896c);
                statement.y(4, entity6.f10897d);
                statement.y(5, entity6.f10898e);
                statement.y(6, entity6.f10899f);
                ((w) this.f4926b).f9920c.getClass();
                i type3 = entity6.g;
                l.e(type3, "type");
                try {
                    str3 = type3.name();
                } catch (Exception unused4) {
                    str3 = "IPTV";
                }
                statement.y(7, str3);
                return;
        }
    }

    @Override // I2.AbstractC0315d
    public final String c() {
        switch (this.f4925a) {
            case 0:
                return "INSERT OR REPLACE INTO `banner_ads` (`id`,`productId`,`title`,`description`,`price`,`productLink`,`qrCodeLink`,`ctaAction`,`ctaUrl`,`sale`,`salePrice`,`imageUrl`,`videoUrl`,`adsType`,`productImages`,`createdAt`,`updatedAt`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `ExtensionsChannel` (`tvGroup`,`logoChannel`,`tvChannelName`,`tvStreamLink`,`sourceFrom`,`channelId`,`channelPreviewProviderId`,`isHls`,`catchupSource`,`userAgent`,`referer`,`props`,`extensionSourceId`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `ExtensionsConfig` (`sourceName`,`sourceUrl`,`type`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `HistoryMediaItemDTO` (`itemId`,`category`,`displayName`,`thumb`,`currentPosition`,`contentDuration`,`isLiveStreaming`,`description`,`linkPlay`,`type`,`lastViewTime`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `TVChannelEntity` (`tvGroup`,`logoChannel`,`tvChannelName`,`tvChannelWebDetailPage`,`sourceFrom`,`channelId`,`channelPreviewProviderId`) VALUES (?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `VideoFavoriteDTO` (`id`,`url`,`title`,`category`,`logoUrl`,`sourceFrom`,`type`) VALUES (?,?,?,?,?,?,?)";
        }
    }
}
