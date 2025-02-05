package com.bizilabs.streeek.lib.remote.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ContributionDTO(
    val id: Long,
    @SerialName("created_at")
    val createdAt: String,
    @SerialName("account_id")
    val accountId: Long,
    @SerialName("github_event_id")
    val githubEventId: String,
    @SerialName("github_event_type")
    val githubEventType: String,
    @SerialName("github_event_date")
    val githubEventDate: String,
    @SerialName("github_event_repo")
    val githubEventRepo: String,
    @SerialName("github_event_actor")
    val githubEventActor: String,
    @SerialName("github_event_payload")
    val githubEventPayload: String,
    val points: Long,
) {
    object Columns {
        const val ID = "id"
        const val CREATEDAT = "created_at"
        const val ACCOUNTID = "account_id"
    }
}

@Serializable
data class CreateContributionDTO(
    @SerialName("account_id")
    val accountId: Long,
    @SerialName("github_event_id")
    val githubEventId: String,
    @SerialName("github_event_type")
    val githubEventType: String,
    @SerialName("github_event_date")
    val githubEventDate: String,
    @SerialName("github_event_repo")
    val githubEventRepo: String,
    @SerialName("github_event_actor")
    val githubEventActor: String,
    @SerialName("github_event_payload")
    val githubEventPayload: String,
    val points: Long,
)
