package Fc;

import H2.E;
import I2.F;
import P2.i;
import P2.j;
import P2.k;
import P2.m;
import P2.n;
import a.AbstractC0672a;
import com.kt.apps.core.storage.local.RoomDataBase_Impl;
import h3.o;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.l;
import tss.r.core.ads.database.AdsDatabase_Impl;
import y7.u0;

/* loaded from: classes2.dex */
public final class b extends E {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4219d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ I2.E f4220e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RoomDataBase_Impl roomDataBase_Impl) {
        super(17, "aeb806c8fc94c4f6998c158adf82d33f", "f45aa6e2343804b7a4bf6e37e73d4655");
        this.f4220e = roomDataBase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AdsDatabase_Impl adsDatabase_Impl) {
        super(1, "fe0c94f1e5aafc986175f6b04c2a6f7c", "ce9f62a917248393086a51a8fb15c2e2");
        this.f4220e = adsDatabase_Impl;
    }

    @Override // H2.E
    public final void a(T2.a connection) {
        switch (this.f4219d) {
            case 0:
                l.e(connection, "connection");
                AbstractC0672a.h(connection, "CREATE TABLE IF NOT EXISTS `video_ads` (`id` TEXT NOT NULL, `videoUrl` TEXT NOT NULL, `duration` INTEGER NOT NULL, `skipAfter` INTEGER NOT NULL, `clickUrl` TEXT, `impressionUrl` TEXT, PRIMARY KEY(`id`))");
                AbstractC0672a.h(connection, "CREATE TABLE IF NOT EXISTS `banner_ads` (`id` TEXT NOT NULL, `productId` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `price` REAL, `productLink` TEXT NOT NULL, `qrCodeLink` TEXT NOT NULL, `ctaAction` TEXT NOT NULL, `ctaUrl` TEXT NOT NULL, `sale` INTEGER, `salePrice` REAL, `imageUrl` TEXT, `videoUrl` TEXT, `adsType` TEXT NOT NULL, `productImages` TEXT, `createdAt` TEXT, `updatedAt` TEXT, PRIMARY KEY(`id`))");
                AbstractC0672a.h(connection, "CREATE TABLE IF NOT EXISTS `ads_version` (`id` INTEGER NOT NULL, `version` INTEGER NOT NULL, `lastUpdated` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                AbstractC0672a.h(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                AbstractC0672a.h(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ce9f62a917248393086a51a8fb15c2e2')");
                return;
            default:
                l.e(connection, "connection");
                AbstractC0672a.h(connection, "CREATE TABLE IF NOT EXISTS `MapChannel` (`channelId` TEXT NOT NULL, `channelName` TEXT NOT NULL, `fromSource` TEXT NOT NULL, `channelGroup` TEXT NOT NULL, PRIMARY KEY(`channelId`))");
                AbstractC0672a.h(connection, "CREATE TABLE IF NOT EXISTS `TVChannelEntity` (`tvGroup` TEXT NOT NULL, `logoChannel` TEXT NOT NULL, `tvChannelName` TEXT NOT NULL, `tvChannelWebDetailPage` TEXT NOT NULL, `sourceFrom` TEXT NOT NULL, `channelId` TEXT NOT NULL, `channelPreviewProviderId` INTEGER NOT NULL, PRIMARY KEY(`channelId`))");
                AbstractC0672a.h(connection, "CREATE TABLE IF NOT EXISTS `FootballMatchEntity` (`homeTeam` TEXT NOT NULL, `awayTeam` TEXT NOT NULL, `kickOffTime` TEXT NOT NULL, `kickOffTimeInSecond` INTEGER NOT NULL, `statusStream` TEXT NOT NULL, `detailPage` TEXT NOT NULL, `sourceFrom` TEXT NOT NULL, `league` TEXT NOT NULL, `matchId` TEXT NOT NULL, PRIMARY KEY(`matchId`))");
                AbstractC0672a.h(connection, "CREATE TABLE IF NOT EXISTS `FootballTeamEntity` (`name` TEXT NOT NULL, `id` TEXT NOT NULL, `league` TEXT NOT NULL, `logo` TEXT NOT NULL, PRIMARY KEY(`id`))");
                AbstractC0672a.h(connection, "CREATE TABLE IF NOT EXISTS `ExtensionsConfig` (`sourceName` TEXT NOT NULL, `sourceUrl` TEXT NOT NULL, `type` TEXT NOT NULL, PRIMARY KEY(`sourceUrl`))");
                AbstractC0672a.h(connection, "CREATE TABLE IF NOT EXISTS `TVChannelDTO` (`tvGroup` TEXT NOT NULL, `logoChannel` TEXT NOT NULL, `tvChannelName` TEXT NOT NULL, `sourceFrom` TEXT NOT NULL, `channelId` TEXT NOT NULL, `searchKey` TEXT NOT NULL, `channelNumber` INTEGER NOT NULL, PRIMARY KEY(`channelId`))");
                AbstractC0672a.h(connection, "CREATE TABLE IF NOT EXISTS `TVChannelUrl` (`src` TEXT, `type` TEXT NOT NULL, `url` TEXT NOT NULL, `tvChannelId` TEXT NOT NULL, PRIMARY KEY(`tvChannelId`, `url`))");
                AbstractC0672a.h(connection, "CREATE TABLE IF NOT EXISTS `ExtensionsChannel` (`tvGroup` TEXT NOT NULL, `logoChannel` TEXT NOT NULL, `tvChannelName` TEXT NOT NULL, `tvStreamLink` TEXT NOT NULL, `sourceFrom` TEXT NOT NULL, `channelId` TEXT NOT NULL, `channelPreviewProviderId` INTEGER NOT NULL, `isHls` INTEGER NOT NULL, `catchupSource` TEXT NOT NULL, `userAgent` TEXT NOT NULL, `referer` TEXT NOT NULL, `props` TEXT, `extensionSourceId` TEXT NOT NULL, PRIMARY KEY(`channelId`, `tvStreamLink`))");
                AbstractC0672a.h(connection, "CREATE TABLE IF NOT EXISTS `ExtensionChannelCategory` (`configSourceUrl` TEXT NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`configSourceUrl`, `name`))");
                AbstractC0672a.h(connection, "CREATE TABLE IF NOT EXISTS `Programme` (`channel` TEXT NOT NULL, `channelNumber` TEXT NOT NULL, `start` TEXT NOT NULL, `stop` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `extensionsConfigId` TEXT NOT NULL, `extensionEpgUrl` TEXT NOT NULL, PRIMARY KEY(`channel`, `title`, `start`))");
                AbstractC0672a.h(connection, "CREATE INDEX IF NOT EXISTS `index_Programme_channel` ON `Programme` (`channel`)");
                AbstractC0672a.h(connection, "CREATE INDEX IF NOT EXISTS `index_Programme_extensionsConfigId` ON `Programme` (`extensionsConfigId`)");
                AbstractC0672a.h(connection, "CREATE INDEX IF NOT EXISTS `index_Programme_extensionEpgUrl` ON `Programme` (`extensionEpgUrl`)");
                AbstractC0672a.h(connection, "CREATE INDEX IF NOT EXISTS `index_Programme_channel_extensionsConfigId` ON `Programme` (`channel`, `extensionsConfigId`)");
                AbstractC0672a.h(connection, "CREATE INDEX IF NOT EXISTS `index_Programme_extensionsConfigId_extensionEpgUrl` ON `Programme` (`extensionsConfigId`, `extensionEpgUrl`)");
                AbstractC0672a.h(connection, "CREATE TABLE IF NOT EXISTS `TVScheduler` (`date` TEXT NOT NULL, `sourceInfoName` TEXT NOT NULL, `generatorInfoName` TEXT NOT NULL, `generatorInfoUrl` TEXT NOT NULL, `extensionsConfigId` TEXT NOT NULL, `epgUrl` TEXT NOT NULL, PRIMARY KEY(`epgUrl`))");
                AbstractC0672a.h(connection, "CREATE VIRTUAL TABLE IF NOT EXISTS `ExtensionsChannelFts4` USING FTS4(`tvGroup` TEXT NOT NULL, `logoChannel` TEXT NOT NULL, `tvChannelName` TEXT NOT NULL, `tvStreamLink` TEXT NOT NULL, `sourceFrom` TEXT NOT NULL, `channelId` TEXT NOT NULL, `channelPreviewProviderId` INTEGER NOT NULL, `isHls` INTEGER NOT NULL, `catchupSource` TEXT NOT NULL, `userAgent` TEXT NOT NULL, `referer` TEXT NOT NULL, `props` TEXT, `extensionSourceId` TEXT NOT NULL, tokenize=unicode61, content=`ExtensionsChannel`)");
                AbstractC0672a.h(connection, "CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ExtensionsChannelFts4_BEFORE_UPDATE BEFORE UPDATE ON `ExtensionsChannel` BEGIN DELETE FROM `ExtensionsChannelFts4` WHERE `docid`=OLD.`rowid`; END");
                AbstractC0672a.h(connection, "CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ExtensionsChannelFts4_BEFORE_DELETE BEFORE DELETE ON `ExtensionsChannel` BEGIN DELETE FROM `ExtensionsChannelFts4` WHERE `docid`=OLD.`rowid`; END");
                AbstractC0672a.h(connection, "CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ExtensionsChannelFts4_AFTER_UPDATE AFTER UPDATE ON `ExtensionsChannel` BEGIN INSERT INTO `ExtensionsChannelFts4`(`docid`, `tvGroup`, `logoChannel`, `tvChannelName`, `tvStreamLink`, `sourceFrom`, `channelId`, `channelPreviewProviderId`, `isHls`, `catchupSource`, `userAgent`, `referer`, `props`, `extensionSourceId`) VALUES (NEW.`rowid`, NEW.`tvGroup`, NEW.`logoChannel`, NEW.`tvChannelName`, NEW.`tvStreamLink`, NEW.`sourceFrom`, NEW.`channelId`, NEW.`channelPreviewProviderId`, NEW.`isHls`, NEW.`catchupSource`, NEW.`userAgent`, NEW.`referer`, NEW.`props`, NEW.`extensionSourceId`); END");
                AbstractC0672a.h(connection, "CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ExtensionsChannelFts4_AFTER_INSERT AFTER INSERT ON `ExtensionsChannel` BEGIN INSERT INTO `ExtensionsChannelFts4`(`docid`, `tvGroup`, `logoChannel`, `tvChannelName`, `tvStreamLink`, `sourceFrom`, `channelId`, `channelPreviewProviderId`, `isHls`, `catchupSource`, `userAgent`, `referer`, `props`, `extensionSourceId`) VALUES (NEW.`rowid`, NEW.`tvGroup`, NEW.`logoChannel`, NEW.`tvChannelName`, NEW.`tvStreamLink`, NEW.`sourceFrom`, NEW.`channelId`, NEW.`channelPreviewProviderId`, NEW.`isHls`, NEW.`catchupSource`, NEW.`userAgent`, NEW.`referer`, NEW.`props`, NEW.`extensionSourceId`); END");
                AbstractC0672a.h(connection, "CREATE TABLE IF NOT EXISTS `HistoryMediaItemDTO` (`itemId` TEXT NOT NULL, `category` TEXT NOT NULL, `displayName` TEXT NOT NULL, `thumb` TEXT NOT NULL, `currentPosition` INTEGER NOT NULL, `contentDuration` INTEGER NOT NULL, `isLiveStreaming` INTEGER NOT NULL, `description` TEXT NOT NULL, `linkPlay` TEXT NOT NULL, `type` TEXT NOT NULL, `lastViewTime` INTEGER NOT NULL, PRIMARY KEY(`itemId`, `linkPlay`))");
                AbstractC0672a.h(connection, "CREATE VIRTUAL TABLE IF NOT EXISTS `TVChannelFts4` USING FTS4(`tvGroup` TEXT NOT NULL, `logoChannel` TEXT NOT NULL, `tvChannelName` TEXT NOT NULL, `sourceFrom` TEXT NOT NULL, `channelId` TEXT NOT NULL, `searchKey` TEXT NOT NULL, tokenize=unicode61, content=`TVChannelDTO`)");
                AbstractC0672a.h(connection, "CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_TVChannelFts4_BEFORE_UPDATE BEFORE UPDATE ON `TVChannelDTO` BEGIN DELETE FROM `TVChannelFts4` WHERE `docid`=OLD.`rowid`; END");
                AbstractC0672a.h(connection, "CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_TVChannelFts4_BEFORE_DELETE BEFORE DELETE ON `TVChannelDTO` BEGIN DELETE FROM `TVChannelFts4` WHERE `docid`=OLD.`rowid`; END");
                AbstractC0672a.h(connection, "CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_TVChannelFts4_AFTER_UPDATE AFTER UPDATE ON `TVChannelDTO` BEGIN INSERT INTO `TVChannelFts4`(`docid`, `tvGroup`, `logoChannel`, `tvChannelName`, `sourceFrom`, `channelId`, `searchKey`) VALUES (NEW.`rowid`, NEW.`tvGroup`, NEW.`logoChannel`, NEW.`tvChannelName`, NEW.`sourceFrom`, NEW.`channelId`, NEW.`searchKey`); END");
                AbstractC0672a.h(connection, "CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_TVChannelFts4_AFTER_INSERT AFTER INSERT ON `TVChannelDTO` BEGIN INSERT INTO `TVChannelFts4`(`docid`, `tvGroup`, `logoChannel`, `tvChannelName`, `sourceFrom`, `channelId`, `searchKey`) VALUES (NEW.`rowid`, NEW.`tvGroup`, NEW.`logoChannel`, NEW.`tvChannelName`, NEW.`sourceFrom`, NEW.`channelId`, NEW.`searchKey`); END");
                AbstractC0672a.h(connection, "CREATE TABLE IF NOT EXISTS `VideoFavoriteDTO` (`id` TEXT NOT NULL, `url` TEXT NOT NULL, `title` TEXT NOT NULL, `category` TEXT NOT NULL, `logoUrl` TEXT NOT NULL, `sourceFrom` TEXT NOT NULL, `type` TEXT NOT NULL, PRIMARY KEY(`id`, `url`))");
                AbstractC0672a.h(connection, "CREATE VIEW `ExtensionChannelDatabaseViews` AS SELECT * FROM ExtensionsChannel ORDER BY CASE WHEN LENGTH(tvChannelName) < 2 THEN tvChannelName WHEN tvChannelName LIKE 'A%' OR tvChannelName LIKE 'Á%' OR tvChannelName LIKE 'À%' OR tvChannelName LIKE 'Ả%' OR tvChannelName LIKE 'Ã%' OR tvChannelName LIKE 'Ạ%' THEN 'A'||substr(tvChannelName, 1, 3) WHEN tvChannelName LIKE 'Â%' OR tvChannelName LIKE 'Ấ%' OR tvChannelName LIKE 'Ầ%' OR tvChannelName LIKE 'Ẩ%' OR tvChannelName LIKE 'Ẫ%' OR tvChannelName LIKE 'Ậ%' THEN 'Azz' WHEN tvChannelName LIKE 'Ă%' OR tvChannelName LIKE 'Ắ%' OR tvChannelName LIKE 'Ằ%' OR tvChannelName LIKE 'Ẳ%' OR tvChannelName LIKE 'Ẵ%' OR tvChannelName LIKE 'Ặ%' THEN 'Az'||substr(tvChannelName, 1 , 2) WHEN tvChannelName LIKE 'Đ%' THEN 'Dz'||substr(tvChannelName, 1 , 2) WHEN tvChannelName LIKE 'Ê%' OR tvChannelName LIKE 'Ế%' OR tvChannelName LIKE 'Ề%' OR tvChannelName LIKE 'Ể%' OR tvChannelName LIKE 'Ễ%' OR tvChannelName LIKE 'Ệ%' THEN 'Ez'||substr(tvChannelName, 1 , 2) WHEN tvChannelName LIKE 'Ô%' OR tvChannelName LIKE 'Ố%' OR tvChannelName LIKE 'Ồ%' OR tvChannelName LIKE 'Ổ%' OR tvChannelName LIKE 'Ỗ%' OR tvChannelName LIKE 'Ộ%' THEN 'Oz'||substr(tvChannelName, 1 , 2) WHEN tvChannelName LIKE 'Ơ%' OR tvChannelName LIKE 'Ớ%' OR tvChannelName LIKE 'Ờ%' OR tvChannelName LIKE 'Ở%' OR tvChannelName LIKE 'Ỡ%' OR tvChannelName LIKE 'Ợ%' THEN 'Ozz' WHEN tvChannelName LIKE 'Ư%' OR tvChannelName LIKE 'Ứ%' OR tvChannelName LIKE 'Ừ%' OR tvChannelName LIKE 'Ử%' OR tvChannelName LIKE 'Ữ%' OR tvChannelName LIKE 'Ự%' THEN 'Uz'||substr(tvChannelName, 1 , 2) ELSE substr(tvChannelName, 0, 3) END");
                AbstractC0672a.h(connection, "CREATE VIEW `ExtensionsChannelDBWithCategoryViews` AS SELECT configSourceUrl, name as categoryName, tvChannelName, logoChannel, tvStreamLink, sourceFrom FROM ExtensionChannelCategory AS Category INNER JOIN ExtensionChannelDatabaseViews ON Category.name = tvGroup");
                AbstractC0672a.h(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                AbstractC0672a.h(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f45aa6e2343804b7a4bf6e37e73d4655')");
                return;
        }
    }

    @Override // H2.E
    public final void c(T2.a connection) {
        switch (this.f4219d) {
            case 0:
                l.e(connection, "connection");
                AbstractC0672a.h(connection, "DROP TABLE IF EXISTS `video_ads`");
                AbstractC0672a.h(connection, "DROP TABLE IF EXISTS `banner_ads`");
                AbstractC0672a.h(connection, "DROP TABLE IF EXISTS `ads_version`");
                return;
            default:
                l.e(connection, "connection");
                AbstractC0672a.h(connection, "DROP TABLE IF EXISTS `MapChannel`");
                AbstractC0672a.h(connection, "DROP TABLE IF EXISTS `TVChannelEntity`");
                AbstractC0672a.h(connection, "DROP TABLE IF EXISTS `FootballMatchEntity`");
                AbstractC0672a.h(connection, "DROP TABLE IF EXISTS `FootballTeamEntity`");
                AbstractC0672a.h(connection, "DROP TABLE IF EXISTS `ExtensionsConfig`");
                AbstractC0672a.h(connection, "DROP TABLE IF EXISTS `TVChannelDTO`");
                AbstractC0672a.h(connection, "DROP TABLE IF EXISTS `TVChannelUrl`");
                AbstractC0672a.h(connection, "DROP TABLE IF EXISTS `ExtensionsChannel`");
                AbstractC0672a.h(connection, "DROP TABLE IF EXISTS `ExtensionChannelCategory`");
                AbstractC0672a.h(connection, "DROP TABLE IF EXISTS `Programme`");
                AbstractC0672a.h(connection, "DROP TABLE IF EXISTS `TVScheduler`");
                AbstractC0672a.h(connection, "DROP TABLE IF EXISTS `ExtensionsChannelFts4`");
                AbstractC0672a.h(connection, "DROP TABLE IF EXISTS `HistoryMediaItemDTO`");
                AbstractC0672a.h(connection, "DROP TABLE IF EXISTS `TVChannelFts4`");
                AbstractC0672a.h(connection, "DROP TABLE IF EXISTS `VideoFavoriteDTO`");
                AbstractC0672a.h(connection, "DROP VIEW IF EXISTS `ExtensionChannelDatabaseViews`");
                AbstractC0672a.h(connection, "DROP VIEW IF EXISTS `ExtensionsChannelDBWithCategoryViews`");
                return;
        }
    }

    @Override // H2.E
    public final void s(T2.a connection) {
        switch (this.f4219d) {
            case 0:
                l.e(connection, "connection");
                return;
            default:
                l.e(connection, "connection");
                return;
        }
    }

    @Override // H2.E
    public final void t(T2.a connection) {
        I2.E e2 = this.f4220e;
        int i7 = this.f4219d;
        l.e(connection, "connection");
        switch (i7) {
            case 0:
                ((AdsDatabase_Impl) e2).s(connection);
                return;
            default:
                int i10 = RoomDataBase_Impl.f16138K;
                ((RoomDataBase_Impl) e2).s(connection);
                return;
        }
    }

    @Override // H2.E
    public final void u(T2.a connection) {
        switch (this.f4219d) {
            case 0:
                l.e(connection, "connection");
                return;
            default:
                l.e(connection, "connection");
                AbstractC0672a.h(connection, "CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ExtensionsChannelFts4_BEFORE_UPDATE BEFORE UPDATE ON `ExtensionsChannel` BEGIN DELETE FROM `ExtensionsChannelFts4` WHERE `docid`=OLD.`rowid`; END");
                AbstractC0672a.h(connection, "CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ExtensionsChannelFts4_BEFORE_DELETE BEFORE DELETE ON `ExtensionsChannel` BEGIN DELETE FROM `ExtensionsChannelFts4` WHERE `docid`=OLD.`rowid`; END");
                AbstractC0672a.h(connection, "CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ExtensionsChannelFts4_AFTER_UPDATE AFTER UPDATE ON `ExtensionsChannel` BEGIN INSERT INTO `ExtensionsChannelFts4`(`docid`, `tvGroup`, `logoChannel`, `tvChannelName`, `tvStreamLink`, `sourceFrom`, `channelId`, `channelPreviewProviderId`, `isHls`, `catchupSource`, `userAgent`, `referer`, `props`, `extensionSourceId`) VALUES (NEW.`rowid`, NEW.`tvGroup`, NEW.`logoChannel`, NEW.`tvChannelName`, NEW.`tvStreamLink`, NEW.`sourceFrom`, NEW.`channelId`, NEW.`channelPreviewProviderId`, NEW.`isHls`, NEW.`catchupSource`, NEW.`userAgent`, NEW.`referer`, NEW.`props`, NEW.`extensionSourceId`); END");
                AbstractC0672a.h(connection, "CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ExtensionsChannelFts4_AFTER_INSERT AFTER INSERT ON `ExtensionsChannel` BEGIN INSERT INTO `ExtensionsChannelFts4`(`docid`, `tvGroup`, `logoChannel`, `tvChannelName`, `tvStreamLink`, `sourceFrom`, `channelId`, `channelPreviewProviderId`, `isHls`, `catchupSource`, `userAgent`, `referer`, `props`, `extensionSourceId`) VALUES (NEW.`rowid`, NEW.`tvGroup`, NEW.`logoChannel`, NEW.`tvChannelName`, NEW.`tvStreamLink`, NEW.`sourceFrom`, NEW.`channelId`, NEW.`channelPreviewProviderId`, NEW.`isHls`, NEW.`catchupSource`, NEW.`userAgent`, NEW.`referer`, NEW.`props`, NEW.`extensionSourceId`); END");
                AbstractC0672a.h(connection, "CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_TVChannelFts4_BEFORE_UPDATE BEFORE UPDATE ON `TVChannelDTO` BEGIN DELETE FROM `TVChannelFts4` WHERE `docid`=OLD.`rowid`; END");
                AbstractC0672a.h(connection, "CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_TVChannelFts4_BEFORE_DELETE BEFORE DELETE ON `TVChannelDTO` BEGIN DELETE FROM `TVChannelFts4` WHERE `docid`=OLD.`rowid`; END");
                AbstractC0672a.h(connection, "CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_TVChannelFts4_AFTER_UPDATE AFTER UPDATE ON `TVChannelDTO` BEGIN INSERT INTO `TVChannelFts4`(`docid`, `tvGroup`, `logoChannel`, `tvChannelName`, `sourceFrom`, `channelId`, `searchKey`) VALUES (NEW.`rowid`, NEW.`tvGroup`, NEW.`logoChannel`, NEW.`tvChannelName`, NEW.`sourceFrom`, NEW.`channelId`, NEW.`searchKey`); END");
                AbstractC0672a.h(connection, "CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_TVChannelFts4_AFTER_INSERT AFTER INSERT ON `TVChannelDTO` BEGIN INSERT INTO `TVChannelFts4`(`docid`, `tvGroup`, `logoChannel`, `tvChannelName`, `sourceFrom`, `channelId`, `searchKey`) VALUES (NEW.`rowid`, NEW.`tvGroup`, NEW.`logoChannel`, NEW.`tvChannelName`, NEW.`sourceFrom`, NEW.`channelId`, NEW.`searchKey`); END");
                return;
        }
    }

    @Override // H2.E
    public final void v(T2.a connection) {
        switch (this.f4219d) {
            case 0:
                l.e(connection, "connection");
                j.d(connection);
                return;
            default:
                l.e(connection, "connection");
                j.d(connection);
                return;
        }
    }

    @Override // H2.E
    public final F w(T2.a connection) {
        switch (this.f4219d) {
            case 0:
                l.e(connection, "connection");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("id", new k(1, 1, "id", "TEXT", null, true));
                linkedHashMap.put("videoUrl", new k(0, 1, "videoUrl", "TEXT", null, true));
                linkedHashMap.put("duration", new k(0, 1, "duration", "INTEGER", null, true));
                linkedHashMap.put("skipAfter", new k(0, 1, "skipAfter", "INTEGER", null, true));
                linkedHashMap.put("clickUrl", new k(0, 1, "clickUrl", "TEXT", null, false));
                linkedHashMap.put("impressionUrl", new k(0, 1, "impressionUrl", "TEXT", null, false));
                n nVar = new n("video_ads", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
                n p10 = j.p(connection, "video_ads");
                if (!nVar.equals(p10)) {
                    return new F(o.m("video_ads(tss.r.core.ads.database.entity.VideoAdEntity).\n Expected:\n", nVar, "\n Found:\n", p10), false);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("id", new k(1, 1, "id", "TEXT", null, true));
                linkedHashMap2.put("productId", new k(0, 1, "productId", "TEXT", null, true));
                linkedHashMap2.put("title", new k(0, 1, "title", "TEXT", null, true));
                linkedHashMap2.put("description", new k(0, 1, "description", "TEXT", null, true));
                linkedHashMap2.put("price", new k(0, 1, "price", "REAL", null, false));
                linkedHashMap2.put("productLink", new k(0, 1, "productLink", "TEXT", null, true));
                linkedHashMap2.put("qrCodeLink", new k(0, 1, "qrCodeLink", "TEXT", null, true));
                linkedHashMap2.put("ctaAction", new k(0, 1, "ctaAction", "TEXT", null, true));
                linkedHashMap2.put("ctaUrl", new k(0, 1, "ctaUrl", "TEXT", null, true));
                linkedHashMap2.put("sale", new k(0, 1, "sale", "INTEGER", null, false));
                linkedHashMap2.put("salePrice", new k(0, 1, "salePrice", "REAL", null, false));
                linkedHashMap2.put("imageUrl", new k(0, 1, "imageUrl", "TEXT", null, false));
                linkedHashMap2.put("videoUrl", new k(0, 1, "videoUrl", "TEXT", null, false));
                linkedHashMap2.put("adsType", new k(0, 1, "adsType", "TEXT", null, true));
                linkedHashMap2.put("productImages", new k(0, 1, "productImages", "TEXT", null, false));
                linkedHashMap2.put("createdAt", new k(0, 1, "createdAt", "TEXT", null, false));
                linkedHashMap2.put("updatedAt", new k(0, 1, "updatedAt", "TEXT", null, false));
                n nVar2 = new n("banner_ads", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
                n p11 = j.p(connection, "banner_ads");
                if (!nVar2.equals(p11)) {
                    return new F(o.m("banner_ads(tss.r.core.ads.database.entity.BannerAdEntity).\n Expected:\n", nVar2, "\n Found:\n", p11), false);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("id", new k(1, 1, "id", "INTEGER", null, true));
                linkedHashMap3.put("version", new k(0, 1, "version", "INTEGER", null, true));
                linkedHashMap3.put("lastUpdated", new k(0, 1, "lastUpdated", "INTEGER", null, true));
                n nVar3 = new n("ads_version", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
                n p12 = j.p(connection, "ads_version");
                return !nVar3.equals(p12) ? new F(o.m("ads_version(tss.r.core.ads.database.entity.AdsVersionEntity).\n Expected:\n", nVar3, "\n Found:\n", p12), false) : new F(null, true);
            default:
                l.e(connection, "connection");
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("channelId", new k(1, 1, "channelId", "TEXT", null, true));
                linkedHashMap4.put("channelName", new k(0, 1, "channelName", "TEXT", null, true));
                linkedHashMap4.put("fromSource", new k(0, 1, "fromSource", "TEXT", null, true));
                linkedHashMap4.put("channelGroup", new k(0, 1, "channelGroup", "TEXT", null, true));
                n nVar4 = new n("MapChannel", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
                n p13 = j.p(connection, "MapChannel");
                if (!nVar4.equals(p13)) {
                    return new F(o.m("MapChannel(com.kt.apps.core.storage.local.dto.MapChannel).\n Expected:\n", nVar4, "\n Found:\n", p13), false);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put("tvGroup", new k(0, 1, "tvGroup", "TEXT", null, true));
                linkedHashMap5.put("logoChannel", new k(0, 1, "logoChannel", "TEXT", null, true));
                linkedHashMap5.put("tvChannelName", new k(0, 1, "tvChannelName", "TEXT", null, true));
                linkedHashMap5.put("tvChannelWebDetailPage", new k(0, 1, "tvChannelWebDetailPage", "TEXT", null, true));
                linkedHashMap5.put("sourceFrom", new k(0, 1, "sourceFrom", "TEXT", null, true));
                linkedHashMap5.put("channelId", new k(1, 1, "channelId", "TEXT", null, true));
                linkedHashMap5.put("channelPreviewProviderId", new k(0, 1, "channelPreviewProviderId", "INTEGER", null, true));
                n nVar5 = new n("TVChannelEntity", linkedHashMap5, new LinkedHashSet(), new LinkedHashSet());
                n p14 = j.p(connection, "TVChannelEntity");
                if (!nVar5.equals(p14)) {
                    return new F(o.m("TVChannelEntity(com.kt.apps.core.storage.local.dto.TVChannelEntity).\n Expected:\n", nVar5, "\n Found:\n", p14), false);
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("homeTeam", new k(0, 1, "homeTeam", "TEXT", null, true));
                linkedHashMap6.put("awayTeam", new k(0, 1, "awayTeam", "TEXT", null, true));
                linkedHashMap6.put("kickOffTime", new k(0, 1, "kickOffTime", "TEXT", null, true));
                linkedHashMap6.put("kickOffTimeInSecond", new k(0, 1, "kickOffTimeInSecond", "INTEGER", null, true));
                linkedHashMap6.put("statusStream", new k(0, 1, "statusStream", "TEXT", null, true));
                linkedHashMap6.put("detailPage", new k(0, 1, "detailPage", "TEXT", null, true));
                linkedHashMap6.put("sourceFrom", new k(0, 1, "sourceFrom", "TEXT", null, true));
                linkedHashMap6.put("league", new k(0, 1, "league", "TEXT", null, true));
                linkedHashMap6.put("matchId", new k(1, 1, "matchId", "TEXT", null, true));
                n nVar6 = new n("FootballMatchEntity", linkedHashMap6, new LinkedHashSet(), new LinkedHashSet());
                n p15 = j.p(connection, "FootballMatchEntity");
                if (!nVar6.equals(p15)) {
                    return new F(o.m("FootballMatchEntity(com.kt.apps.core.storage.local.dto.FootballMatchEntity).\n Expected:\n", nVar6, "\n Found:\n", p15), false);
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                linkedHashMap7.put("name", new k(0, 1, "name", "TEXT", null, true));
                linkedHashMap7.put("id", new k(1, 1, "id", "TEXT", null, true));
                linkedHashMap7.put("league", new k(0, 1, "league", "TEXT", null, true));
                linkedHashMap7.put("logo", new k(0, 1, "logo", "TEXT", null, true));
                n nVar7 = new n("FootballTeamEntity", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
                n p16 = j.p(connection, "FootballTeamEntity");
                if (!nVar7.equals(p16)) {
                    return new F(o.m("FootballTeamEntity(com.kt.apps.core.storage.local.dto.FootballTeamEntity).\n Expected:\n", nVar7, "\n Found:\n", p16), false);
                }
                LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                linkedHashMap8.put("sourceName", new k(0, 1, "sourceName", "TEXT", null, true));
                linkedHashMap8.put("sourceUrl", new k(1, 1, "sourceUrl", "TEXT", null, true));
                linkedHashMap8.put("type", new k(0, 1, "type", "TEXT", null, true));
                n nVar8 = new n("ExtensionsConfig", linkedHashMap8, new LinkedHashSet(), new LinkedHashSet());
                n p17 = j.p(connection, "ExtensionsConfig");
                if (!nVar8.equals(p17)) {
                    return new F(o.m("ExtensionsConfig(com.kt.apps.core.extensions.ExtensionsConfig).\n Expected:\n", nVar8, "\n Found:\n", p17), false);
                }
                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                linkedHashMap9.put("tvGroup", new k(0, 1, "tvGroup", "TEXT", null, true));
                linkedHashMap9.put("logoChannel", new k(0, 1, "logoChannel", "TEXT", null, true));
                linkedHashMap9.put("tvChannelName", new k(0, 1, "tvChannelName", "TEXT", null, true));
                linkedHashMap9.put("sourceFrom", new k(0, 1, "sourceFrom", "TEXT", null, true));
                linkedHashMap9.put("channelId", new k(1, 1, "channelId", "TEXT", null, true));
                linkedHashMap9.put("searchKey", new k(0, 1, "searchKey", "TEXT", null, true));
                linkedHashMap9.put("channelNumber", new k(0, 1, "channelNumber", "INTEGER", null, true));
                n nVar9 = new n("TVChannelDTO", linkedHashMap9, new LinkedHashSet(), new LinkedHashSet());
                n p18 = j.p(connection, "TVChannelDTO");
                if (!nVar9.equals(p18)) {
                    return new F(o.m("TVChannelDTO(com.kt.apps.core.storage.local.dto.TVChannelDTO).\n Expected:\n", nVar9, "\n Found:\n", p18), false);
                }
                LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                linkedHashMap10.put("src", new k(0, 1, "src", "TEXT", null, false));
                linkedHashMap10.put("type", new k(0, 1, "type", "TEXT", null, true));
                linkedHashMap10.put("url", new k(2, 1, "url", "TEXT", null, true));
                linkedHashMap10.put("tvChannelId", new k(1, 1, "tvChannelId", "TEXT", null, true));
                n nVar10 = new n("TVChannelUrl", linkedHashMap10, new LinkedHashSet(), new LinkedHashSet());
                n p19 = j.p(connection, "TVChannelUrl");
                if (!nVar10.equals(p19)) {
                    return new F(o.m("TVChannelUrl(com.kt.apps.core.storage.local.dto.TVChannelDTO.TVChannelUrl).\n Expected:\n", nVar10, "\n Found:\n", p19), false);
                }
                LinkedHashMap linkedHashMap11 = new LinkedHashMap();
                linkedHashMap11.put("tvGroup", new k(0, 1, "tvGroup", "TEXT", null, true));
                linkedHashMap11.put("logoChannel", new k(0, 1, "logoChannel", "TEXT", null, true));
                linkedHashMap11.put("tvChannelName", new k(0, 1, "tvChannelName", "TEXT", null, true));
                linkedHashMap11.put("tvStreamLink", new k(2, 1, "tvStreamLink", "TEXT", null, true));
                linkedHashMap11.put("sourceFrom", new k(0, 1, "sourceFrom", "TEXT", null, true));
                linkedHashMap11.put("channelId", new k(1, 1, "channelId", "TEXT", null, true));
                linkedHashMap11.put("channelPreviewProviderId", new k(0, 1, "channelPreviewProviderId", "INTEGER", null, true));
                linkedHashMap11.put("isHls", new k(0, 1, "isHls", "INTEGER", null, true));
                linkedHashMap11.put("catchupSource", new k(0, 1, "catchupSource", "TEXT", null, true));
                linkedHashMap11.put("userAgent", new k(0, 1, "userAgent", "TEXT", null, true));
                linkedHashMap11.put("referer", new k(0, 1, "referer", "TEXT", null, true));
                linkedHashMap11.put("props", new k(0, 1, "props", "TEXT", null, false));
                linkedHashMap11.put("extensionSourceId", new k(0, 1, "extensionSourceId", "TEXT", null, true));
                n nVar11 = new n("ExtensionsChannel", linkedHashMap11, new LinkedHashSet(), new LinkedHashSet());
                n p20 = j.p(connection, "ExtensionsChannel");
                if (!nVar11.equals(p20)) {
                    return new F(o.m("ExtensionsChannel(com.kt.apps.core.extensions.ExtensionsChannel).\n Expected:\n", nVar11, "\n Found:\n", p20), false);
                }
                LinkedHashMap linkedHashMap12 = new LinkedHashMap();
                linkedHashMap12.put("configSourceUrl", new k(1, 1, "configSourceUrl", "TEXT", null, true));
                linkedHashMap12.put("name", new k(2, 1, "name", "TEXT", null, true));
                n nVar12 = new n("ExtensionChannelCategory", linkedHashMap12, new LinkedHashSet(), new LinkedHashSet());
                n p21 = j.p(connection, "ExtensionChannelCategory");
                if (!nVar12.equals(p21)) {
                    return new F(o.m("ExtensionChannelCategory(com.kt.apps.core.storage.local.dto.ExtensionChannelCategory).\n Expected:\n", nVar12, "\n Found:\n", p21), false);
                }
                LinkedHashMap linkedHashMap13 = new LinkedHashMap();
                linkedHashMap13.put("channel", new k(1, 1, "channel", "TEXT", null, true));
                linkedHashMap13.put("channelNumber", new k(0, 1, "channelNumber", "TEXT", null, true));
                linkedHashMap13.put("start", new k(3, 1, "start", "TEXT", null, true));
                linkedHashMap13.put("stop", new k(0, 1, "stop", "TEXT", null, true));
                linkedHashMap13.put("title", new k(2, 1, "title", "TEXT", null, true));
                linkedHashMap13.put("description", new k(0, 1, "description", "TEXT", null, true));
                linkedHashMap13.put("extensionsConfigId", new k(0, 1, "extensionsConfigId", "TEXT", null, true));
                linkedHashMap13.put("extensionEpgUrl", new k(0, 1, "extensionEpgUrl", "TEXT", null, true));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new m("index_Programme_channel", false, u0.x("channel"), u0.x("ASC")));
                linkedHashSet2.add(new m("index_Programme_extensionsConfigId", false, u0.x("extensionsConfigId"), u0.x("ASC")));
                linkedHashSet2.add(new m("index_Programme_extensionEpgUrl", false, u0.x("extensionEpgUrl"), u0.x("ASC")));
                linkedHashSet2.add(new m("index_Programme_channel_extensionsConfigId", false, u0.y("channel", "extensionsConfigId"), u0.y("ASC", "ASC")));
                linkedHashSet2.add(new m("index_Programme_extensionsConfigId_extensionEpgUrl", false, u0.y("extensionsConfigId", "extensionEpgUrl"), u0.y("ASC", "ASC")));
                n nVar13 = new n("Programme", linkedHashMap13, linkedHashSet, linkedHashSet2);
                n p22 = j.p(connection, "Programme");
                if (!nVar13.equals(p22)) {
                    return new F(o.m("Programme(com.kt.apps.core.extensions.model.TVScheduler.Programme).\n Expected:\n", nVar13, "\n Found:\n", p22), false);
                }
                LinkedHashMap linkedHashMap14 = new LinkedHashMap();
                linkedHashMap14.put("date", new k(0, 1, "date", "TEXT", null, true));
                linkedHashMap14.put("sourceInfoName", new k(0, 1, "sourceInfoName", "TEXT", null, true));
                linkedHashMap14.put("generatorInfoName", new k(0, 1, "generatorInfoName", "TEXT", null, true));
                linkedHashMap14.put("generatorInfoUrl", new k(0, 1, "generatorInfoUrl", "TEXT", null, true));
                linkedHashMap14.put("extensionsConfigId", new k(0, 1, "extensionsConfigId", "TEXT", null, true));
                linkedHashMap14.put("epgUrl", new k(1, 1, "epgUrl", "TEXT", null, true));
                n nVar14 = new n("TVScheduler", linkedHashMap14, new LinkedHashSet(), new LinkedHashSet());
                n p23 = j.p(connection, "TVScheduler");
                if (!nVar14.equals(p23)) {
                    return new F(o.m("TVScheduler(com.kt.apps.core.extensions.model.TVScheduler).\n Expected:\n", nVar14, "\n Found:\n", p23), false);
                }
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                linkedHashSet3.add("tvGroup");
                linkedHashSet3.add("logoChannel");
                linkedHashSet3.add("tvChannelName");
                linkedHashSet3.add("tvStreamLink");
                linkedHashSet3.add("sourceFrom");
                linkedHashSet3.add("channelId");
                linkedHashSet3.add("channelPreviewProviderId");
                linkedHashSet3.add("isHls");
                linkedHashSet3.add("catchupSource");
                linkedHashSet3.add("userAgent");
                linkedHashSet3.add("referer");
                linkedHashSet3.add("props");
                linkedHashSet3.add("extensionSourceId");
                i iVar = new i("ExtensionsChannelFts4", linkedHashSet3, j.l("CREATE VIRTUAL TABLE IF NOT EXISTS `ExtensionsChannelFts4` USING FTS4(`tvGroup` TEXT NOT NULL, `logoChannel` TEXT NOT NULL, `tvChannelName` TEXT NOT NULL, `tvStreamLink` TEXT NOT NULL, `sourceFrom` TEXT NOT NULL, `channelId` TEXT NOT NULL, `channelPreviewProviderId` INTEGER NOT NULL, `isHls` INTEGER NOT NULL, `catchupSource` TEXT NOT NULL, `userAgent` TEXT NOT NULL, `referer` TEXT NOT NULL, `props` TEXT, `extensionSourceId` TEXT NOT NULL, tokenize=unicode61, content=`ExtensionsChannel`)"));
                i o10 = j.o(connection, "ExtensionsChannelFts4");
                if (!iVar.equals(o10)) {
                    return new F("ExtensionsChannelFts4(com.kt.apps.core.storage.local.databaseviews.ExtensionsChannelFts4).\n Expected:\n" + iVar + "\n Found:\n" + o10, false);
                }
                LinkedHashMap linkedHashMap15 = new LinkedHashMap();
                linkedHashMap15.put("itemId", new k(1, 1, "itemId", "TEXT", null, true));
                linkedHashMap15.put("category", new k(0, 1, "category", "TEXT", null, true));
                linkedHashMap15.put("displayName", new k(0, 1, "displayName", "TEXT", null, true));
                linkedHashMap15.put("thumb", new k(0, 1, "thumb", "TEXT", null, true));
                linkedHashMap15.put("currentPosition", new k(0, 1, "currentPosition", "INTEGER", null, true));
                linkedHashMap15.put("contentDuration", new k(0, 1, "contentDuration", "INTEGER", null, true));
                linkedHashMap15.put("isLiveStreaming", new k(0, 1, "isLiveStreaming", "INTEGER", null, true));
                linkedHashMap15.put("description", new k(0, 1, "description", "TEXT", null, true));
                linkedHashMap15.put("linkPlay", new k(2, 1, "linkPlay", "TEXT", null, true));
                linkedHashMap15.put("type", new k(0, 1, "type", "TEXT", null, true));
                linkedHashMap15.put("lastViewTime", new k(0, 1, "lastViewTime", "INTEGER", null, true));
                n nVar15 = new n("HistoryMediaItemDTO", linkedHashMap15, new LinkedHashSet(), new LinkedHashSet());
                n p24 = j.p(connection, "HistoryMediaItemDTO");
                if (!nVar15.equals(p24)) {
                    return new F(o.m("HistoryMediaItemDTO(com.kt.apps.core.storage.local.dto.HistoryMediaItemDTO).\n Expected:\n", nVar15, "\n Found:\n", p24), false);
                }
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                linkedHashSet4.add("tvGroup");
                linkedHashSet4.add("logoChannel");
                linkedHashSet4.add("tvChannelName");
                linkedHashSet4.add("sourceFrom");
                linkedHashSet4.add("channelId");
                linkedHashSet4.add("searchKey");
                i iVar2 = new i("TVChannelFts4", linkedHashSet4, j.l("CREATE VIRTUAL TABLE IF NOT EXISTS `TVChannelFts4` USING FTS4(`tvGroup` TEXT NOT NULL, `logoChannel` TEXT NOT NULL, `tvChannelName` TEXT NOT NULL, `sourceFrom` TEXT NOT NULL, `channelId` TEXT NOT NULL, `searchKey` TEXT NOT NULL, tokenize=unicode61, content=`TVChannelDTO`)"));
                i o11 = j.o(connection, "TVChannelFts4");
                if (!iVar2.equals(o11)) {
                    return new F("TVChannelFts4(com.kt.apps.core.storage.local.dto.TVChannelFts4).\n Expected:\n" + iVar2 + "\n Found:\n" + o11, false);
                }
                LinkedHashMap linkedHashMap16 = new LinkedHashMap();
                linkedHashMap16.put("id", new k(1, 1, "id", "TEXT", null, true));
                linkedHashMap16.put("url", new k(2, 1, "url", "TEXT", null, true));
                linkedHashMap16.put("title", new k(0, 1, "title", "TEXT", null, true));
                linkedHashMap16.put("category", new k(0, 1, "category", "TEXT", null, true));
                linkedHashMap16.put("logoUrl", new k(0, 1, "logoUrl", "TEXT", null, true));
                linkedHashMap16.put("sourceFrom", new k(0, 1, "sourceFrom", "TEXT", null, true));
                linkedHashMap16.put("type", new k(0, 1, "type", "TEXT", null, true));
                n nVar16 = new n("VideoFavoriteDTO", linkedHashMap16, new LinkedHashSet(), new LinkedHashSet());
                n p25 = j.p(connection, "VideoFavoriteDTO");
                if (!nVar16.equals(p25)) {
                    return new F(o.m("VideoFavoriteDTO(com.kt.apps.core.storage.local.dto.VideoFavoriteDTO).\n Expected:\n", nVar16, "\n Found:\n", p25), false);
                }
                P2.o oVar = new P2.o("ExtensionChannelDatabaseViews", "CREATE VIEW `ExtensionChannelDatabaseViews` AS SELECT * FROM ExtensionsChannel ORDER BY CASE WHEN LENGTH(tvChannelName) < 2 THEN tvChannelName WHEN tvChannelName LIKE 'A%' OR tvChannelName LIKE 'Á%' OR tvChannelName LIKE 'À%' OR tvChannelName LIKE 'Ả%' OR tvChannelName LIKE 'Ã%' OR tvChannelName LIKE 'Ạ%' THEN 'A'||substr(tvChannelName, 1, 3) WHEN tvChannelName LIKE 'Â%' OR tvChannelName LIKE 'Ấ%' OR tvChannelName LIKE 'Ầ%' OR tvChannelName LIKE 'Ẩ%' OR tvChannelName LIKE 'Ẫ%' OR tvChannelName LIKE 'Ậ%' THEN 'Azz' WHEN tvChannelName LIKE 'Ă%' OR tvChannelName LIKE 'Ắ%' OR tvChannelName LIKE 'Ằ%' OR tvChannelName LIKE 'Ẳ%' OR tvChannelName LIKE 'Ẵ%' OR tvChannelName LIKE 'Ặ%' THEN 'Az'||substr(tvChannelName, 1 , 2) WHEN tvChannelName LIKE 'Đ%' THEN 'Dz'||substr(tvChannelName, 1 , 2) WHEN tvChannelName LIKE 'Ê%' OR tvChannelName LIKE 'Ế%' OR tvChannelName LIKE 'Ề%' OR tvChannelName LIKE 'Ể%' OR tvChannelName LIKE 'Ễ%' OR tvChannelName LIKE 'Ệ%' THEN 'Ez'||substr(tvChannelName, 1 , 2) WHEN tvChannelName LIKE 'Ô%' OR tvChannelName LIKE 'Ố%' OR tvChannelName LIKE 'Ồ%' OR tvChannelName LIKE 'Ổ%' OR tvChannelName LIKE 'Ỗ%' OR tvChannelName LIKE 'Ộ%' THEN 'Oz'||substr(tvChannelName, 1 , 2) WHEN tvChannelName LIKE 'Ơ%' OR tvChannelName LIKE 'Ớ%' OR tvChannelName LIKE 'Ờ%' OR tvChannelName LIKE 'Ở%' OR tvChannelName LIKE 'Ỡ%' OR tvChannelName LIKE 'Ợ%' THEN 'Ozz' WHEN tvChannelName LIKE 'Ư%' OR tvChannelName LIKE 'Ứ%' OR tvChannelName LIKE 'Ừ%' OR tvChannelName LIKE 'Ử%' OR tvChannelName LIKE 'Ữ%' OR tvChannelName LIKE 'Ự%' THEN 'Uz'||substr(tvChannelName, 1 , 2) ELSE substr(tvChannelName, 0, 3) END");
                P2.o q10 = j.q(connection, "ExtensionChannelDatabaseViews");
                if (!oVar.equals(q10)) {
                    return new F("ExtensionChannelDatabaseViews(com.kt.apps.core.storage.local.databaseviews.ExtensionChannelDatabaseViews).\n Expected:\n" + oVar + "\n Found:\n" + q10, false);
                }
                P2.o oVar2 = new P2.o("ExtensionsChannelDBWithCategoryViews", "CREATE VIEW `ExtensionsChannelDBWithCategoryViews` AS SELECT configSourceUrl, name as categoryName, tvChannelName, logoChannel, tvStreamLink, sourceFrom FROM ExtensionChannelCategory AS Category INNER JOIN ExtensionChannelDatabaseViews ON Category.name = tvGroup");
                P2.o q11 = j.q(connection, "ExtensionsChannelDBWithCategoryViews");
                if (oVar2.equals(q11)) {
                    return new F(null, true);
                }
                return new F("ExtensionsChannelDBWithCategoryViews(com.kt.apps.core.storage.local.databaseviews.ExtensionsChannelDBWithCategoryViews).\n Expected:\n" + oVar2 + "\n Found:\n" + q11, false);
        }
    }
}
