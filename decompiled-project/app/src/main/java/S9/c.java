package S9;

/* loaded from: classes2.dex */
public final class c extends M2.a {
    @Override // M2.a
    public final void a(U2.a database) {
        kotlin.jvm.internal.l.e(database, "database");
        database.o("ALTER TABLE `TVChannelDTO` ADD COLUMN `searchKey` TEXT NOT NULL DEFAULT ''");
        database.o("CREATE VIRTUAL TABLE IF NOT EXISTS `TVChannelFts4` USING FTS4(`tvGroup` TEXT NOT NULL, `logoChannel` TEXT NOT NULL, `tvChannelName` TEXT NOT NULL, `sourceFrom` TEXT NOT NULL, `channelId` TEXT NOT NULL, `searchKey` TEXT NOT NULL, tokenize=unicode61, content=`TVChannelDTO`)");
        database.o("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_TVChannelFts4_BEFORE_UPDATE BEFORE UPDATE ON `TVChannelDTO` BEGIN DELETE FROM `TVChannelFts4` WHERE `docid`=OLD.`rowid`; END");
        database.o("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_TVChannelFts4_BEFORE_DELETE BEFORE DELETE ON `TVChannelDTO` BEGIN DELETE FROM `TVChannelFts4` WHERE `docid`=OLD.`rowid`; END");
        database.o("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_TVChannelFts4_AFTER_UPDATE AFTER UPDATE ON `TVChannelDTO` BEGIN INSERT INTO `TVChannelFts4`(`docid`, `tvGroup`, `logoChannel`, `tvChannelName`, `sourceFrom`, `channelId`, `searchKey`) VALUES (NEW.`rowid`, NEW.`tvGroup`, NEW.`logoChannel`, NEW.`tvChannelName`, NEW.`sourceFrom`, NEW.`channelId`, NEW.`searchKey`); END");
        database.o("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_TVChannelFts4_AFTER_INSERT AFTER INSERT ON `TVChannelDTO` BEGIN INSERT INTO `TVChannelFts4`(`docid`, `tvGroup`, `logoChannel`, `tvChannelName`, `sourceFrom`, `channelId`, `searchKey`) VALUES (NEW.`rowid`, NEW.`tvGroup`, NEW.`logoChannel`, NEW.`tvChannelName`, NEW.`sourceFrom`, NEW.`channelId`, NEW.`searchKey`); END");
    }
}
