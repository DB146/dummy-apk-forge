package S9;

/* loaded from: classes2.dex */
public final class k extends M2.a {
    @Override // M2.a
    public final void a(U2.a database) {
        kotlin.jvm.internal.l.e(database, "database");
        database.o("CREATE TABLE IF NOT EXISTS `Programme` (`channel` TEXT NOT NULL, `channelNumber` TEXT NOT NULL, `start` TEXT NOT NULL, `stop` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `extensionsConfigId` TEXT NOT NULL, `extensionEpgUrl` TEXT NOT NULL, PRIMARY KEY(`channel`, `title`, `start`))");
        database.o("CREATE TABLE IF NOT EXISTS `TVScheduler` (`date` TEXT NOT NULL, `sourceInfoName` TEXT NOT NULL, `generatorInfoName` TEXT NOT NULL, `generatorInfoUrl` TEXT NOT NULL, `extensionsConfigId` TEXT NOT NULL, `epgUrl` TEXT NOT NULL, PRIMARY KEY(`epgUrl`))");
    }
}
