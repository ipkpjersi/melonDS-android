package me.magnum.melonds.domain.services

import io.reactivex.Observable
import me.magnum.melonds.domain.model.AppUpdate
import me.magnum.melonds.domain.model.DownloadProgress

interface TaskManager {
    fun downloadAndInstallUpdate(update: AppUpdate): Observable<DownloadProgress>
}