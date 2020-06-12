resource "google_container_cluster" "gke-cluster" {
  name               = "${var.app_name}-cluster"
  location           = var.gcp_zone_1
  initial_node_count = 2

  node_config {
    service_account = "${google_service_account.gke_nodes.email}"
    preemptible  = true
    machine_type = "n1-standard-1"
    oauth_scopes = [
      "storage-ro",
      "logging-write",
      "monitoring",
      "https://www.googleapis.com/auth/logging.write",
      "https://www.googleapis.com/auth/monitoring",
    ]
  }
}
