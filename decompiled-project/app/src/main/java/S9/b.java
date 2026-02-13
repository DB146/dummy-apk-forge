package S9;

/* loaded from: classes2.dex */
public final class b extends M2.a {
    @Override // M2.a
    public final void a(U2.a database) {
        kotlin.jvm.internal.l.e(database, "database");
        database.o("CREATE VIEW `ExtensionsChannelDBWithCategoryViews` AS SELECT configSourceUrl, name as categoryName, tvChannelName, logoChannel, tvStreamLink, sourceFrom FROM ExtensionChannelCategory AS Category INNER JOIN ExtensionChannelDatabaseViews ON Category.name = tvGroup");
        database.o("CREATE VIRTUAL TABLE IF NOT EXISTS `ExtensionsChannelFts4` USING FTS4(tokenize=unicode61, content=`ExtensionsChannel`)");
        database.o("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ExtensionsChannelFts4_BEFORE_UPDATE BEFORE UPDATE ON `ExtensionsChannel` BEGIN DELETE FROM `ExtensionsChannelFts4` WHERE `docid`=OLD.`rowid`; END");
        database.o("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ExtensionsChannelFts4_BEFORE_DELETE BEFORE DELETE ON `ExtensionsChannel` BEGIN DELETE FROM `ExtensionsChannelFts4` WHERE `docid`=OLD.`rowid`; END");
        database.o("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ExtensionsChannelFts4_AFTER_UPDATE AFTER UPDATE ON `ExtensionsChannel` BEGIN INSERT INTO `ExtensionsChannelFts4`(`docid`, `tvGroup`, `logoChannel`, `tvChannelName`, `tvStreamLink`, `sourceFrom`, `channelId`, `channelPreviewProviderId`, `isHls`, `catchupSource`, `userAgent`, `referer`, `props`, `extensionSourceId`) VALUES (NEW.`rowid`, NEW.`tvGroup`, NEW.`logoChannel`, NEW.`tvChannelName`, NEW.`tvStreamLink`, NEW.`sourceFrom`, NEW.`channelId`, NEW.`channelPreviewProviderId`, NEW.`isHls`, NEW.`catchupSource`, NEW.`userAgent`, NEW.`referer`, NEW.`props`, NEW.`extensionSourceId`); END");
        database.o("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ExtensionsChannelFts4_AFTER_INSERT AFTER INSERT ON `ExtensionsChannel` BEGIN INSERT INTO `ExtensionsChannelFts4`(`docid`, `tvGroup`, `logoChannel`, `tvChannelName`, `tvStreamLink`, `sourceFrom`, `channelId`, `channelPreviewProviderId`, `isHls`, `catchupSource`, `userAgent`, `referer`, `props`, `extensionSourceId`) VALUES (NEW.`rowid`, NEW.`tvGroup`, NEW.`logoChannel`, NEW.`tvChannelName`, NEW.`tvStreamLink`, NEW.`sourceFrom`, NEW.`channelId`, NEW.`channelPreviewProviderId`, NEW.`isHls`, NEW.`catchupSource`, NEW.`userAgent`, NEW.`referer`, NEW.`props`, NEW.`extensionSourceId`); END");
        database.o("CREATE TABLE IF NOT EXISTS `HistoryMediaItemDTO` (`itemId` TEXT NOT NULL, `category` TEXT NOT NULL, `displayName` TEXT NOT NULL, `thumb` TEXT NOT NULL, `currentPosition` INTEGER NOT NULL, `contentDuration` INTEGER NOT NULL, `isLiveStreaming` INTEGER NOT NULL, `description` TEXT NOT NULL, `linkPlay` TEXT NOT NULL, `type` TEXT NOT NULL, `lastViewTime` INTEGER NOT NULL, PRIMARY KEY(`itemId`, `linkPlay`))");
    }
}
