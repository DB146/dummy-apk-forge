package Hc;

import I2.AbstractC0315d;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class a extends AbstractC0315d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4922a;

    @Override // I2.AbstractC0315d
    public final void b(T2.c statement, Object obj) {
        switch (this.f4922a) {
            case 0:
                Ic.a entity = (Ic.a) obj;
                l.e(statement, "statement");
                l.e(entity, "entity");
                statement.f(1, entity.f5355a);
                statement.f(2, entity.f5356b);
                statement.f(3, entity.f5357c);
                return;
            case 1:
                W9.a entity2 = (W9.a) obj;
                l.e(statement, "statement");
                l.e(entity2, "entity");
                statement.y(1, entity2.f10853a);
                statement.y(2, entity2.f10854b);
                return;
            case 2:
                W9.d entity3 = (W9.d) obj;
                l.e(statement, "statement");
                l.e(entity3, "entity");
                statement.y(1, entity3.f10866a);
                statement.y(2, entity3.f10867b);
                statement.y(3, entity3.f10868c);
                statement.y(4, entity3.f10869d);
                return;
            case 3:
                W9.e entity4 = (W9.e) obj;
                l.e(statement, "statement");
                l.e(entity4, "entity");
                statement.y(1, entity4.g());
                statement.y(2, entity4.c());
                statement.y(3, entity4.f());
                statement.y(4, entity4.e());
                statement.y(5, entity4.a());
                statement.y(6, entity4.d());
                statement.f(7, entity4.b());
                return;
            case 4:
                N9.a entity5 = (N9.a) obj;
                l.e(statement, "statement");
                l.e(entity5, "entity");
                statement.y(1, entity5.f7389a);
                statement.y(2, entity5.f7390b);
                statement.y(3, entity5.f7391c);
                statement.y(4, entity5.f7392d);
                statement.y(5, entity5.f7393e);
                statement.y(6, entity5.f7394f);
                statement.y(7, entity5.f7395u);
                statement.y(8, entity5.f7396v);
                return;
            default:
                N9.b entity6 = (N9.b) obj;
                l.e(statement, "statement");
                l.e(entity6, "entity");
                statement.y(1, entity6.f7400a);
                statement.y(2, entity6.f7401b);
                statement.y(3, entity6.f7402c);
                statement.y(4, entity6.f7403d);
                statement.y(5, entity6.f7404e);
                statement.y(6, entity6.f7405f);
                return;
        }
    }

    @Override // I2.AbstractC0315d
    public final String c() {
        switch (this.f4922a) {
            case 0:
                return "INSERT OR REPLACE INTO `ads_version` (`id`,`version`,`lastUpdated`) VALUES (?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `ExtensionChannelCategory` (`configSourceUrl`,`name`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `MapChannel` (`channelId`,`channelName`,`fromSource`,`channelGroup`) VALUES (?,?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `TVChannelDTO` (`tvGroup`,`logoChannel`,`tvChannelName`,`sourceFrom`,`channelId`,`searchKey`,`channelNumber`) VALUES (?,?,?,?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `Programme` (`channel`,`channelNumber`,`start`,`stop`,`title`,`description`,`extensionsConfigId`,`extensionEpgUrl`) VALUES (?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `TVScheduler` (`date`,`sourceInfoName`,`generatorInfoName`,`generatorInfoUrl`,`extensionsConfigId`,`epgUrl`) VALUES (?,?,?,?,?,?)";
        }
    }
}
