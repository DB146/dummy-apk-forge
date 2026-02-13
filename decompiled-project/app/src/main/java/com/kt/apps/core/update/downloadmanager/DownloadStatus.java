package com.kt.apps.core.update.downloadmanager;

import A3.c;
import java.io.File;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public abstract class DownloadStatus {

    /* loaded from: classes2.dex */
    public static final class Connecting extends DownloadStatus {
        public static final Connecting INSTANCE = new Connecting();

        private Connecting() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Connecting);
        }

        public int hashCode() {
            return 339267849;
        }

        public String toString() {
            return "Connecting";
        }
    }

    /* loaded from: classes2.dex */
    public static final class Downloaded extends DownloadStatus {
        private final File file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Downloaded(File file) {
            super(null);
            l.e(file, "file");
            this.file = file;
        }

        public static /* synthetic */ Downloaded copy$default(Downloaded downloaded, File file, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                file = downloaded.file;
            }
            return downloaded.copy(file);
        }

        public final File component1() {
            return this.file;
        }

        public final Downloaded copy(File file) {
            l.e(file, "file");
            return new Downloaded(file);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Downloaded) && l.a(this.file, ((Downloaded) obj).file);
        }

        public final File getFile() {
            return this.file;
        }

        public int hashCode() {
            return this.file.hashCode();
        }

        public String toString() {
            return "Downloaded(file=" + this.file + ")";
        }
    }

    /* loaded from: classes2.dex */
    public static final class Downloading extends DownloadStatus {
        private final int progress;

        public Downloading(int i7) {
            super(null);
            this.progress = i7;
        }

        public static /* synthetic */ Downloading copy$default(Downloading downloading, int i7, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i7 = downloading.progress;
            }
            return downloading.copy(i7);
        }

        public final int component1() {
            return this.progress;
        }

        public final Downloading copy(int i7) {
            return new Downloading(i7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Downloading) && this.progress == ((Downloading) obj).progress;
        }

        public final int getProgress() {
            return this.progress;
        }

        public int hashCode() {
            return Integer.hashCode(this.progress);
        }

        public String toString() {
            return c.f(this.progress, "Downloading(progress=", ")");
        }
    }

    /* loaded from: classes2.dex */
    public static final class Failed extends DownloadStatus {
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(Throwable throwable) {
            super(null);
            l.e(throwable, "throwable");
            this.throwable = throwable;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, Throwable th, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                th = failed.throwable;
            }
            return failed.copy(th);
        }

        public final Throwable component1() {
            return this.throwable;
        }

        public final Failed copy(Throwable throwable) {
            l.e(throwable, "throwable");
            return new Failed(throwable);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failed) && l.a(this.throwable, ((Failed) obj).throwable);
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Failed(throwable=" + this.throwable + ")";
        }
    }

    /* loaded from: classes2.dex */
    public static final class Pending extends DownloadStatus {
        public static final Pending INSTANCE = new Pending();

        private Pending() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Pending);
        }

        public int hashCode() {
            return -1342127898;
        }

        public String toString() {
            return "Pending";
        }
    }

    private DownloadStatus() {
    }

    public /* synthetic */ DownloadStatus(f fVar) {
        this();
    }
}
